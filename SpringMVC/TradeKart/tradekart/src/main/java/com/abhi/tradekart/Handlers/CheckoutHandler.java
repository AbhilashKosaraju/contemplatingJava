package com.abhi.tradekart.Handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhi.tradekartserver.dao.CartLineDAO;
import com.abhi.tradekartserver.dao.ProductDAO;
import com.abhi.tradekartserver.dao.UserDAO;
import com.abhi.tradekartserver.dto.Address;
import com.abhi.tradekartserver.dto.Cart;
import com.abhi.tradekartserver.dto.CartLine;
import com.abhi.tradekartserver.dto.OrderDetail;
import com.abhi.tradekartserver.dto.OrderItem;
import com.abhi.tradekartserver.dto.Product;
import com.abhi.tradekartserver.dto.User;
import com.abhi.tradekart.Model.CheckoutModel;
import com.abhi.tradekart.Model.UserModel;

@Component
public class CheckoutHandler {

	private static final Logger logger = LoggerFactory.getLogger(CheckoutHandler.class);
	User currentUser;
	List<String> proList = new ArrayList<String>();

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private CartLineDAO cartLineDAO;

	@Autowired
	private HttpSession session;

	public CheckoutModel init(String name) throws Exception {

		User user = userDAO.getByEmail(name);
		currentUser = user;
		CheckoutModel checkoutModel = null;

		if (user != null) {
			checkoutModel = new CheckoutModel();
			checkoutModel.setUser(user);
			checkoutModel.setCart(user.getCart());

			double checkoutTotal = 0.0;
			List<CartLine> cartLines = cartLineDAO.listAvailable(user.getCart().getId());

			if (cartLines.size() == 0) {
				throw new Exception("There are no products available for checkout now!");
			}

			for (CartLine cartLine : cartLines) {
				checkoutTotal += cartLine.getTotal();
			}

			checkoutModel.setCartLines(cartLines);
			checkoutModel.setCheckoutTotal(checkoutTotal);
		}

		return checkoutModel;
	}

	public List<Address> getShippingAddresses(CheckoutModel model) {

		List<Address> addresses = userDAO.listShippingAddresses(model.getUser().getId());
		if (addresses.size() == 0) {
			addresses = new ArrayList<>();
		}

		addresses.add(addresses.size(), userDAO.getBillingAddress(model.getUser().getId()));
		return addresses;

	}

	public String saveAddressSelection(CheckoutModel checkoutModel, int shippingId) {

		String transitionValue = "success";
		Address shipping = userDAO.getAddress(shippingId);
		checkoutModel.setShipping(shipping);
		return transitionValue;

	}

	public String saveAddress(CheckoutModel checkoutModel, Address shipping) {

		String transitionValue = "success";

		shipping.setUserId(checkoutModel.getUser().getId());
		shipping.setShipping(true);
		userDAO.addAddress(shipping);
		checkoutModel.setShipping(shipping);

		return transitionValue;

	}

	public String saveOrder(CheckoutModel checkoutModel) {
		String transitionValue = "success";

		// New order object
		OrderDetail orderDetail = new OrderDetail();

		// Assigning the user
		orderDetail.setUser(checkoutModel.getUser());

		// Assigning the shipping address
		orderDetail.setShipping(checkoutModel.getShipping());

		// Getting the billing address
		Address billing = userDAO.getBillingAddress(checkoutModel.getUser().getId());
		orderDetail.setBilling(billing);

		List<CartLine> cartLines = checkoutModel.getCartLines();
		OrderItem orderItem = null;

		double orderTotal = 0.0;
		int orderCount = 0;
		Product product = null;

		for (CartLine cartLine : cartLines) {

			orderItem = new OrderItem();

			orderItem.setBuyingPrice(cartLine.getBuyingPrice());
			orderItem.setProduct(cartLine.getProduct());
			orderItem.setProductCount(cartLine.getProductCount());
			orderItem.setTotal(cartLine.getTotal());

			orderItem.setOrderDetail(orderDetail);
			orderDetail.getOrderItems().add(orderItem);

			orderTotal += orderItem.getTotal();
			orderCount++;

			product = cartLine.getProduct();
			// Adding products to the global product list
			proList.add(product.toString());
			product.setQuantity(product.getQuantity() - cartLine.getProductCount());
			product.setPurchases(product.getPurchases() + cartLine.getProductCount());
			productDAO.update(product);

			// delete the cartLine
			cartLineDAO.remove(cartLine);

		}

		orderDetail.setOrderTotal(orderTotal);
		orderDetail.setOrderCount(orderCount);
		orderDetail.setOrderDate(new Date());

		// save the order
		cartLineDAO.addOrderDetail(orderDetail);

		// set it to the orderDetails of checkoutModel
		checkoutModel.setOrderDetail(orderDetail);

		// update the cart
		Cart cart = checkoutModel.getCart();
		cart.setGrandTotal(cart.getGrandTotal() - orderTotal);
		cart.setCartLines(cart.getCartLines() - orderCount);
		cartLineDAO.updateCart(cart);

		// update the cart if its in the session
		UserModel userModel = (UserModel) session.getAttribute("userModel");
		if (userModel != null) {
			userModel.setCart(cart);
		}

		String mail = currentUser.getEmail();
		String order = "Your Order Id is" + orderDetail.getId() + "\n You payed a total of "
				+ orderDetail.getOrderTotal() + "to TradeKart" + " on " + orderDetail.getOrderDate()
				+ "\n And the Products are" + Arrays.toString(proList.toArray());
		sendEmail(mail, order);

		return transitionValue;
	}

	public OrderDetail getOrderDetail(CheckoutModel checkoutModel) {
		return checkoutModel.getOrderDetail();
	}

	public void sendEmail(String useremail, String message) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("contactapplication2018@gmail.com", "springmvc"));
			email.setSSLOnConnect(true);
			email.setFrom("no-reply@msis.neu.edu"); // This user email does not
													// exist
			email.setSubject(
					"Product Purchase - TradeKart");
			email.setMsg(message); // Retrieve email from the DAO and send this
			email.addTo(useremail);
			email.send();
		} catch (EmailException e) {
			System.out.println("Email cannot be sent");
		}
	}

}

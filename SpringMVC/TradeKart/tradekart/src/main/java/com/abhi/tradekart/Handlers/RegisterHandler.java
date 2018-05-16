package com.abhi.tradekart.Handlers;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.abhi.tradekartserver.dao.UserDAO;
import com.abhi.tradekartserver.dto.Address;
import com.abhi.tradekartserver.dto.Cart;
import com.abhi.tradekartserver.dto.User;
import com.abhi.tradekart.Model.RegisterModel;

@Component
public class RegisterHandler {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserDAO userDAO;

	public RegisterModel init() {
		return new RegisterModel();
	}

	public void addUser(RegisterModel registerModel, User user) {
		registerModel.setUser(user);
	}

	public void addBilling(RegisterModel registerModel, Address billing) {
		registerModel.setBilling(billing);
	}

	public String validateUser(User user, MessageContext error) {
		String transitionValue = "success";
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			error.addMessage(new MessageBuilder().error().source("confirmPassword")
					.defaultText("Passwords do not match!").build());
			transitionValue = "failure";
		}
		if (userDAO.getByEmail(user.getEmail()) != null) {
			error.addMessage(new MessageBuilder().error().source("email").defaultText("An account  has already been registered with this Email id.Retrieve your password in case you have forgotten.")
					.build());
			transitionValue = "failure";
		}
		return transitionValue;
	}

	public String saveAll(RegisterModel registerModel) {
		String transitionValue = "success";
		User user = registerModel.getUser();
		if (user.getRole().equals("USER")) {
			// create a new cart
			Cart cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);
		}

		// encode the password
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		// save the user
		userDAO.add(user);

		// save the billing address
		Address billing = registerModel.getBilling();
		billing.setUserId(user.getId());
		billing.setBilling(true);
		userDAO.addAddress(billing);

		String email = user.getEmail();
		String Address = String.valueOf(billing);
		sendEmail(email, "You have successfully created an account. Your registerd address is \n " + Address);

		return transitionValue;
	}

	public void sendEmail(String useremail, String message) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("contactapplication2018@gmail.com", "springmvc"));
			email.setSSLOnConnect(true);
			email.setFrom("no-reply@msis.neu.edu"); 
													
			email.setSubject(
					"New UserAccount -TradeKart");
			email.setMsg(message); 
			email.addTo(useremail);
			email.send();
		} catch (EmailException e) {
			System.out.println("Email cannot be sent");
		}
	}
}

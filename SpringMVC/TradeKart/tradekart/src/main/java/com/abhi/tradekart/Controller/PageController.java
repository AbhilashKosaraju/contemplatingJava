package com.abhi.tradekart.Controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.tradekart.Exception.ProductNotFoundException;
import com.abhi.tradekartserver.dao.CategoryDAO;
import com.abhi.tradekartserver.dao.ProductDAO;
import com.abhi.tradekartserver.dao.UserDAO;
import com.abhi.tradekartserver.dto.Category;
import com.abhi.tradekartserver.dto.Product;
import com.abhi.tradekartserver.dto.User;
import com.captcha.botdetect.web.servlet.Captcha;

@Controller
public class PageController {

	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index(@RequestParam(name = "logout", required = false) String logout) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");

		logger.info("Inside PageController index method - INFO");
		logger.debug("Inside PageController index method - DEBUG");

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());

		if (logout != null) {
			mv.addObject("message", "You have successfully logged out!");
		}

		mv.addObject("userClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/whatwedo")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/joinus")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}

	/*
	 * Methods to load all the products and based on category
	 */

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());

		mv.addObject("userClickAllProducts", true);
		return mv;
	}

	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) throws ProductNotFoundException  {
		ModelAndView mv = new ModelAndView("page");

		// categoryDAO to fetch a single category
		Category category = null;

		category = categoryDAO.get(id);
		if (category == null)
			throw new ProductNotFoundException();

		mv.addObject("title", category.getName());

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());

		// passing the single category object
		mv.addObject("category", category);

		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}

	/*
	 * Viewing a single product
	 */

	@RequestMapping(value = "/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id) throws ProductNotFoundException {

		ModelAndView mv = new ModelAndView("page");

		Product product = productDAO.get(id);

		if (product == null)
			throw new ProductNotFoundException();

		// update the view count
		product.setViews(product.getViews() + 1);
		productDAO.update(product);
		// ---------------------------

		mv.addObject("title", product.getName());
		mv.addObject("product", product);

		mv.addObject("userClickShowProduct", true);

		return mv;

	}

	@RequestMapping(value = "/membership")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView("page");

		logger.info("Page Controller membership called!");

		return mv;
	}

	/*
	 * Handling User login
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout, String username,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("title", "Login");
			if (error != null) {
				mv.addObject("message", "Username and Password is invalid!");
			}
			if (logout != null) {
				mv.addObject("logout", "You have logged out successfully!");
			}
		return mv;
	}

	@RequestMapping(value = "/forgot")
	public ModelAndView getForgotPasswordForm(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("forgot");
		mv.addObject("title", "Forgot Password");
		return mv;
	}

	@RequestMapping(value = "/emailsent")
	public ModelAndView emailsent(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("emailsent");
		mv.addObject("title", "EmailSent");

		HttpSession session = request.getSession();
		Random rand = new Random();
		int randomNum1 = rand.nextInt(5000000);
		int randomNum2 = rand.nextInt(5000000);

		String useremail = request.getParameter("username");
		Captcha captcha = Captcha.load(request, "CaptchaObject");
		String captchaCode = request.getParameter("captchaCode");
		if (captcha.validate(captchaCode)) {
			User user = userDAO.getByEmail(useremail);
			//sendEmail(useremail, "Your password is : " + user.getPassword());
			mv.addObject("message", "The password reset link has been successfully sent to the above email address");
            mv.addObject("email",useremail);
			String str = "http://localhost:8080/TradeKart/resetPassword?email=" + useremail + "&key1=" + randomNum1 + "&key2=" + randomNum2;
			session.setAttribute("key1", randomNum1);
			session.setAttribute("key2", randomNum2);
			sendEmail(useremail, "Reset your password: " + str);
			mv.addObject("emaillink",str);

			return mv;
		} else {
			
			ModelAndView mvv = new ModelAndView("forgot");
			mvv.addObject("message","Invalid Captcha");
			return mvv;
			 
		}
	}
	
	@RequestMapping(value= "/resetPassword",method = RequestMethod.GET)
	public ModelAndView reset(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView("resetPassword");
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		int key1 = Integer.parseInt(request.getParameter("key1"));
		int key2 = Integer.parseInt(request.getParameter("key2"));
		System.out.println(session.getAttribute("key1") );
		System.out.println(session.getAttribute("key2") );
		
		if ((Integer)(session.getAttribute("key1")) == key1 && ((Integer)session.getAttribute("key2"))== key2) 
		{
			try {
				User user = userDAO.getByEmail(email);
				String name = user.getFirstName() + user.getLastName();
				mv.addObject("emailId",email);
				mv.addObject("name",name);
				return mv;

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			ModelAndView mvv = new ModelAndView("testView");
			mvv.addObject("errorMessage", "Link expired , generate new link");
			mvv.addObject("resendLink", true);
			return mvv;
		}
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "/newPassword")
	public ModelAndView newPassword(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("newPasswordSuccess");
		
		String email= request.getParameter("rusername");
		User user = userDAO.getByEmail(email);
		String fname = user.getFirstName();
		String lname = user.getLastName();
		String name = fname+" "+lname;
		String password = request.getParameter("rpassword");
		String cpassword =request.getParameter("rcpassword");
		if(password.equals(cpassword)) {			
			if(userDAO.updatePassword(user, password))
			{
				//mv.addObject("NewPassword", cpassword);
				mv.addObject("Name",name);
				mv.addObject("message","New password has been set Successfully");
				return mv;
			}	
			
			else {
				mv.addObject("message","Password updation in to database failed.Try after sometime");
				return mv;
			}
			
		}else {
			mv.addObject("NewPassword", password);
			mv.addObject("NewcPassword", cpassword);
			mv.addObject("message","Password reset failed");
			return mv;
			
		}
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return "redirect:/login?logout";
	}

	@RequestMapping(value = "/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "You have no access to this page.");
		mv.addObject("errorDescription", "You are no authorized to the contents of this page!");
		mv.addObject("title", "403 Access Denied");
		return mv;
	}
	
	@RequestMapping(value = "/export", method=RequestMethod.POST)
	public ModelAndView exportDetails() {					

		List<Product> productList = productDAO.list();
		return new ModelAndView("ProductListExcel", "productlList", productList);
		
	}

	public void sendEmail(String useremail, String message) {
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("contactapplication2018@gmail.com", "springmvc"));
			email.setSSLOnConnect(true);
			email.setFrom("no-reply@msis.neu.edu"); 
			email.setSubject("Password Retrieval - TradeKart");
			email.setMsg(message+ "\n Reset your password \n If you have not requested for a password reset, then please contact the admin"); 
			email.addTo(useremail);
			email.send();
		} catch (EmailException e) {
			System.out.println("Email cannot be sent");
		}
	}

}

package org.abhi.loginpage.service;

import java.util.HashMap;

import org.abhi.loginpage.dto.User;

public class LoginService {
	
	HashMap<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("JohnDoe","John Doe");
		users.put("Joey","Joey");
		users.put("Chandler","Chandler");
		users.put("Ross", "Geller");
	}
	
	public boolean authenticate(String userId,String password) {
		
		if(password == null || password.trim() == "") {
			return false;
		}
		return true;
	}
	
//	public String getUsername(String userId) {
//	
//		return users.get(userId); 
//		
//	}
	
	public User getUserDetails(String userId) {
		
		User user = new User();
		user.setUserId(users.get(userId));
		user.setUserName(users.get(userId));
		return user;
		
		
	}
	
}

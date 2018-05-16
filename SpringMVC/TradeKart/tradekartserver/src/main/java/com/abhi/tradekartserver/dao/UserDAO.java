package com.abhi.tradekartserver.dao;

import java.util.List;

import com.abhi.tradekartserver.dto.Address;
import com.abhi.tradekartserver.dto.Cart;
import com.abhi.tradekartserver.dto.User;

public interface UserDAO {

	// user related operation
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	boolean updatePassword(User user,String pwd);
	
	// adding and updating a new address
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}

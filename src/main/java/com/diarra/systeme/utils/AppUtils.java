package com.diarra.systeme.utils;

import com.diarra.systeme.bean.User;
import com.diarra.systeme.dto.RegisterRequest;

public class AppUtils {


	public static User mapRegisterRequestToUser(RegisterRequest registerRequest) {
		User user = new User();
		
		user.setName(registerRequest.getName());
		user.setUsername(registerRequest.getUsername());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(registerRequest.getPassword());
		
		return user;
		
	}
	
}

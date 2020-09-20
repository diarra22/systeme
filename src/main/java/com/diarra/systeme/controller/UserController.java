package com.diarra.systeme.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.diarra.systeme.bean.User;
import com.diarra.systeme.bussiness.user.UserBusiness;
import com.diarra.systeme.dto.AuthRequest;
import com.diarra.systeme.dto.RegisterRequest;
import com.diarra.systeme.utils.AppUtils;

import java.util.Optional;

@RestController
@RequestMapping(UserController.PATH)
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class UserController {
	
	private UserBusiness userBusiness;
	
	static final String PATH = "users";

	public UserController(UserBusiness userBusiness) {
		super();
		this.userBusiness = userBusiness;
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> authentication(@RequestBody AuthRequest authRequest) throws Exception {
		return ResponseEntity.ok(userBusiness.authentication(authRequest.getUsername(), authRequest.getPassword()));
	}

	@PostMapping("/register")
	@ResponseStatus(code = HttpStatus.CREATED)
	public User authentication(@RequestBody RegisterRequest registerRequest) throws Exception {
		User user = AppUtils.mapRegisterRequestToUser(registerRequest);
		System.out.println("controller auth " + user.toString());
		return userBusiness.registration(user);
	}

	@GetMapping("/me")
	public ResponseEntity<User> getUserAuthenticated(Authentication auth)
			throws Exception {
		String usernameAuthenticated = auth.getName();
		User user =  Optional.ofNullable(userBusiness.getByUsername(usernameAuthenticated))
				.orElseThrow(() -> new Exception("User not found for this username :: " + usernameAuthenticated));

		return ResponseEntity.ok().body(user);
	}

	@PutMapping("/update")
	public ResponseEntity<User> getUserUpdate(Authentication auth, @RequestBody RegisterRequest registerRequest)
			throws Exception {
		String usernameAuthenticated = auth.getName();
		User user =  Optional.ofNullable(userBusiness.getByUsername(usernameAuthenticated))
				.orElseThrow(() -> new Exception("User not found for this username : " + usernameAuthenticated));

		return ResponseEntity.ok(userBusiness.update(user, registerRequest));
	}

	@GetMapping("/username/{userid}")
	public ResponseEntity<User> getByUsername(@PathVariable(value = "userid") String username)
			throws Exception {

		User user =  Optional.ofNullable(userBusiness.getByUsername(username))
				.orElseThrow(() -> new Exception("User not found for this username :: " + username));

		return ResponseEntity.ok().body(user);
	}
	
}

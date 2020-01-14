package com.ali.hyacinth.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demousers")
public class UserController {
	
	@PostMapping
	public String createUser() {
		return "A user is created.";
	}

}

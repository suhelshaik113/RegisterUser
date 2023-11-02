package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.web.dto.UserRegistractionDto;

import service.UserService;

@Controller
@RequestMapping("/registraction")
public class UserRegistrationController {
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping
	public String showRegistrationForm() {
		return "registraction";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistractionDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	

}

package com.jsp.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.ecommerce.dto.CustomerDto;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@GetMapping("/register")
	public String loadRegister(CustomerDto customerDto  , Model model) {
		model.addAttribute("customerDto", customerDto);
		return "customer-register.html";
	}
	@PostMapping("/register")
 	public String register(@Valid CustomerDto customerDto, BindingResult result) {
 		if (result.hasErrors()) {
 			return "customer-register.html";
 		}
 		return "redirect:/";
 	}

}

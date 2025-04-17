package com.jsp.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsp.ecommerce.dto.MerchantDto;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
	
	@GetMapping("/register")
	public String loadRegister(MerchantDto merchantDto, Model model) {
		model.addAttribute("merchantDto", merchantDto);
		return "merchant-register.html";
	}
	@PostMapping("/register")
 	public String register(@Valid MerchantDto merchantDto, BindingResult result) {
 		if (result.hasErrors()) {
 			return "merchant-register.html";
 		}
 		return "redirect:/";
 	}

}

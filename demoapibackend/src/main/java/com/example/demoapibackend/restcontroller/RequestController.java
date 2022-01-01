package com.example.demoapibackend.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/baseMapping")
public class RequestController {
	
	
	@GetMapping(value = "/getDetails")
	public String getDetails(){
		System.out.println("Here from getDetails");
		return "From the get mapping method";
		
	}
	
	
	
	
	@PostMapping(value = "/postDetails")
	public String postDetails(){
		System.out.println("Here from postDetails");
		return "From the post mapping method ";
		
	}
	
	
	
	
	
	
	
	
	
	

}

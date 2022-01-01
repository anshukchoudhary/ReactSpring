package com.example.demoapibackend.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/baseMapping")
public class RequestController {
	
	// Latest way
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
	
	@DeleteMapping(value = "/deleteDetails")
	public String deleteDetails(){
		System.out.println("Here from deleteDetails");
		return "From the delete mapping method ";
		
	}
	
	@PutMapping(value = "/putDetails")
	public String putDetails(){
		System.out.println("Here from putDetails");
		return "From the put mapping method ";
		
	}
	
	//Old way 
	@RequestMapping(value = "/getDetails/{reqId}", method = RequestMethod.GET)
	public String getDetailsOldSyntax(@PathVariable("reqId") Long id){
		System.out.println("Here from old syntax getDetails");
		return "From the old syntax get mapping method "+ id;
		
	}
	//or use same name of var a param as in path variable
	@RequestMapping(value = "/getDetails/{reqId}/oldSyntax2", method = RequestMethod.GET)
	public String getDetailsOldSyntax2(@PathVariable Long reqId){
		System.out.println("Here from old syntax getDetails");
		return "From the old syntax get mapping method "+ reqId;
		
	}
	
	
	
	
	
	
	
	
	
	

}

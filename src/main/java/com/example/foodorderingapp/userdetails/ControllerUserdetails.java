package com.example.foodorderingapp.userdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class ControllerUserdetails {

	
	private final ServiceUserdetails serviceUserdetails;
	
	@Autowired
	public ControllerUserdetails(ServiceUserdetails serviceUserdetails) {
		this.serviceUserdetails = serviceUserdetails;
	}
	
	@PostMapping("/postUserData")
	public String storeUserData(@RequestBody Userdetails ud) {
		
		return serviceUserdetails.storeUserdetails(ud.getFullname(),ud.getEmailid(),ud.getUserpassword(),ud.getMobileno());
	}
	
	@GetMapping("/getUserData")
	public ResponseEntity<?> getUserDetails(@RequestParam String emailid, @RequestParam String userpassword){
		String loginid = "";
		System.out.println(emailid);
		System.out.println(userpassword);
		loginid = serviceUserdetails.getUserDetails(emailid,userpassword);
		System.out.println(loginid);
		if(loginid.length()>0)
		{
			System.out.println("Inside if");
			Userdetails loginUser = serviceUserdetails.getFullUserDetails(loginid);
			System.out.println(loginUser);
			return ResponseEntity.ok(loginUser);
		}
		else 
		{
			System.out.println("Inside else");
			return ResponseEntity.ok("Invalid EmailID or Passcode");
		}
	}
	@GetMapping(value="/showData")
	public String showData()
	{
		System.out.println("Hello World");
		return "Hello";
	}
}

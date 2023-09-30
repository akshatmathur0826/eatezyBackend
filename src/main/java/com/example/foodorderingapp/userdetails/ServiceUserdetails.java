package com.example.foodorderingapp.userdetails;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserdetails {
	
	
	private final RepositoryUserdetails repositoryUserdetails;
	
	@Autowired
	public ServiceUserdetails(RepositoryUserdetails repositoryUserdetails) {
		this.repositoryUserdetails = repositoryUserdetails;
	}

	
	public String storeUserdetails(String fullname, String emailid, String userpassword, String mobileno) {
		
		return repositoryUserdetails.storeUserdetails(fullname,emailid,userpassword,mobileno);
	}


	public String getUserDetails(String emailid, String userpassword) {
		// TODO Auto-generated method stub
		String loginid  = repositoryUserdetails.getUserDetails(emailid,userpassword);
		return loginid;
	}


	public Userdetails getFullUserDetails(String loginid) {
		//Optional<Userdetails> ud = repositoryUserdetails.findById(loginid)
		return repositoryUserdetails.findById(loginid).orElse(null);
	}


	public List<Userdetails> showData() {
		// TODO Auto-generated method stub
		return repositoryUserdetails.showData();
		//return null;
	}
}

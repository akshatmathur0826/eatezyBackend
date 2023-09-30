package com.example.foodorderingapp.malldetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceMallDetails {
	
	private final RepositoryMallDetails RepositoryMallDetails;
	
	@Autowired
	public ServiceMallDetails(RepositoryMallDetails RepositoryMallDetails) {
		this.RepositoryMallDetails = RepositoryMallDetails;
		}
	
	public Malldetails getMallData(String mallid)
	{
		return RepositoryMallDetails.findById(mallid).orElse(null);
	}

}

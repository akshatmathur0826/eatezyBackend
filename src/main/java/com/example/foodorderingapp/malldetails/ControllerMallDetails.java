package com.example.foodorderingapp.malldetails;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class ControllerMallDetails {

	private final ServiceMallDetails ServiceMallDetails;
	
	public ControllerMallDetails(ServiceMallDetails ServiceMallDetails)
	{
		this.ServiceMallDetails = ServiceMallDetails;
	}
	
	@GetMapping("/getMallid")
	public Malldetails mallid(@RequestParam String mallid)
	{
		Malldetails md = ServiceMallDetails.getMallData(mallid);
		
		return md;
	}
}

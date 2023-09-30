package com.example.foodorderingapp.restaurantdetails;

import com.example.foodorderingapp.malldetails.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class ControllerRestaurantdetails {
	
	@Autowired
	private RepositoryMallDetails RepositoryMallDetails;

	@Autowired
	private final Servicerestaurantdetails ServicerestaurantDetails;
	
	public ControllerRestaurantdetails(Servicerestaurantdetails ServicerestaurantDetails)
	{
		this.ServicerestaurantDetails = ServicerestaurantDetails;
	}
	
	@GetMapping("/restaurantdetails")
	public List<Restaurantdetails> restaurantDetails(@RequestParam String mallid)
	{
		System.out.println("mallid is "+mallid);
		Malldetails md = RepositoryMallDetails.findById(mallid).orElse(null);
		System.out.println("malldata is "+md);
		if(md == null)
		{
			return new ArrayList<>();
		}
		else
		{
			return ServicerestaurantDetails.getRestaurantsByMall(md);
		}
	}
	
	@GetMapping("/getMallimage")
    public List<String> getMallImage(@RequestParam String mallid) throws IOException {
	 System.out.println("mallid inside getMallImage"+mallid);
	 Malldetails md = RepositoryMallDetails.findById(mallid).orElse(null);
		System.out.println("malldata is "+md);
		if(md == null)
		{
			return new ArrayList<>();
		}
        List<byte[]> imageBytes = ServicerestaurantDetails.getrestaurantImage(md);
        List<String> imageInString = new ArrayList<String>();
        for(int i=0;i<imageBytes.size();i++)
        {
        	String byteArrayAsBase64 = Base64.getEncoder().encodeToString(imageBytes.get(i));
        	imageInString.add(byteArrayAsBase64);
        	
        }
        
        return imageInString;
       
    }

	
}

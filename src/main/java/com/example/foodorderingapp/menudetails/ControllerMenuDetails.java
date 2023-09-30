package com.example.foodorderingapp.menudetails;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.foodorderingapp.restaurantdetails.RepositoryRestaurantdetails;
import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;


@RestController
@CrossOrigin()
public class ControllerMenuDetails {
	
	@Autowired
	private ServiceMenuDetails servicemenudetails;
	
	@Autowired
	private RepositoryRestaurantdetails respositoryrestaurantdetails;
	
	public ControllerMenuDetails(ServiceMenuDetails servicemenudetails)
	{
		this.servicemenudetails = servicemenudetails;
	}
	
	@GetMapping("/menuitems")
	public List<Menudetails>getMenuItems(@RequestParam String restaurantid)
	{
		Restaurantdetails rd = respositoryrestaurantdetails.findById(restaurantid).orElse(null);
		System.out.println("malldata is "+rd);
		if(rd == null)
		{
			return new ArrayList<>();
		}
		else
		{
			return servicemenudetails.getMenuItems(rd);
		}
	}

}

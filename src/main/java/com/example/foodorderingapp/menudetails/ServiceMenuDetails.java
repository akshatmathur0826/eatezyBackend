package com.example.foodorderingapp.menudetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;

@Service
public class ServiceMenuDetails {
	
	@Autowired
	private RepositoryMenuDetails repositorymenudetails;
	
	public ServiceMenuDetails(RepositoryMenuDetails repositorymenudetails) {
		this.repositorymenudetails = repositorymenudetails;
	}
	
	public List<Menudetails> getMenuItems(Restaurantdetails restaurant)
	{
		return repositorymenudetails.findByrestaurantdetails(restaurant);
	}

}

package com.example.foodorderingapp.orderdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;

@Service
public class ServiceOrderDetails {

	@Autowired
	private RepositoryOrderDetails RepositoryOrderDetails;
	
	public ServiceOrderDetails(RepositoryOrderDetails RepositoryOrderDetails)
	{
		this.RepositoryOrderDetails = RepositoryOrderDetails;
	}
	
	public void postOrderDetails(OrderDetails od) 
	{
		RepositoryOrderDetails.save(od);
	}
	
	public OrderDetails getOrderDetails(String emailid)
	{
		return RepositoryOrderDetails.getOrderDetails(emailid);//.orElse(null);
	}

	public List<OrderDetails> viewpreviousorders(String emailid) {
		// TODO Auto-generated method stub
		return RepositoryOrderDetails.previousOrders(emailid);
	}
}

//String orderid,String emailid,List<Restaurantdetails> restaurantdetails,String timeoforderplaced, String totalcost

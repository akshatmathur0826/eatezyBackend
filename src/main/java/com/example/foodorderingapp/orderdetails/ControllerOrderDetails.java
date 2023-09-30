package com.example.foodorderingapp.orderdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodorderingapp.menudetails.Menudetails;
import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;


@RestController
@CrossOrigin()
public class ControllerOrderDetails {
	
	//@Autowired
	private ServiceOrderDetails ServiceOrderDetails;
//	@Autowired
//	private Restaurantdetails restaurantdetails;
	//@Autowired
	//private Menudetails menudetails;
	

	@Autowired
	public ControllerOrderDetails(ServiceOrderDetails serviceOrderDetails) {
		super();
		this.ServiceOrderDetails = serviceOrderDetails;
	}



	@PostMapping("/postOrderData")
	public void postOrderDetails(@RequestBody OrderDetails od)
	{
		 //ServiceOrderDetails.postOrderDetails(od.getOrderid(),od.getUseremailid(),od.getrestaurantdetails(),od.getTimeofPlacingOrder(),od.getTotalcost());
		ServiceOrderDetails.postOrderDetails(od);
	}
	
	@GetMapping("/vieworderdetails")
	public ResponseEntity<?> getOrderDetails(@RequestParam String emailid)
	{
		OrderDetails od = ServiceOrderDetails.getOrderDetails(emailid);
		System.out.println(od);
		if(od!=null)
		{
			return ResponseEntity.ok(od);
		}
		else
		{
			return ResponseEntity.ok("You have not placed any order yet...");
		}
	}
	
	@GetMapping("/viewpreviousorderdetails")
	public List<OrderDetails> viewpreviousorders(@RequestParam String emailid)
	{
		return ServiceOrderDetails.viewpreviousorders(emailid);
	}

}

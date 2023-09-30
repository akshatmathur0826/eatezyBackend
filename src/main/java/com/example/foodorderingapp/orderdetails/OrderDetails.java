package com.example.foodorderingapp.orderdetails;

import java.util.List;

import com.example.foodorderingapp.menudetails.Menudetails;
import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="orderdetails")
public class OrderDetails {

	@Id
	private String orderid;
	
	//@Column(name="emailid")
	//@Id
	private String useremailid;
	
	private String timeofplacingorder;
	
	//@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "foodid")
    private String menudetails;
	private String totalcost;
	
	public OrderDetails() {}
	
	public OrderDetails( String orderid, String useremailid, String timeofplacingorder,
			String menudetails, String totalcost) {
		super();
		this.orderid = orderid;
		this.useremailid = useremailid;
		this.timeofplacingorder = timeofplacingorder;
		this.menudetails = menudetails;
		this.totalcost = totalcost;
	}

	

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getUseremailid() {
		return useremailid;
	}

	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}

	public String getTimeofPlacingOrder() {
		return timeofplacingorder;
	}

	public void setTimeofPlacingOrder(String timeofplacingorder) {
		this.timeofplacingorder = timeofplacingorder;
	}

	public String getmenudetails() {
		return menudetails;
	}

	public void setmenudetails(String menudetails) {
		this.menudetails = menudetails;
	}

	public String getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(String totalcost) {
		this.totalcost = totalcost;
	}
	
	
}

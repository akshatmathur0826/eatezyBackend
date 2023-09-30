package com.example.foodorderingapp.menudetails;

import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Menudetails {
	@Id
	private String foodid;
	@ManyToOne
    @JoinColumn(name = "restaurantid")
	private Restaurantdetails restaurantdetails;
	private String foodcategoryid;
	private String foodcategoryname;
	private String foodheader;
	private String fooddescription;
	private double foodcost;
	
	
	public Menudetails() {}


	public Menudetails(String foodid, Restaurantdetails restaurantdetails, String foodcategoryid,
			String foodcategoryname, String foodheader, String fooddescription, double foodcost) {
		super();
		this.foodid = foodid;
		this.restaurantdetails = restaurantdetails;
		this.foodcategoryid = foodcategoryid;
		this.foodcategoryname = foodcategoryname;
		this.foodheader = foodheader;
		this.fooddescription = fooddescription;
		this.foodcost = foodcost;
	}


	public String getFoodid() {
		return foodid;
	}


	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}


	public Restaurantdetails getRestaurantdetails() {
		return restaurantdetails;
	}


	public void setRestaurantdetails(Restaurantdetails restaurantdetails) {
		this.restaurantdetails = restaurantdetails;
	}


	public String getFoodcategoryid() {
		return foodcategoryid;
	}


	public void setFoodcategoryid(String foodcategoryid) {
		this.foodcategoryid = foodcategoryid;
	}


	public String getFoodcategoryname() {
		return foodcategoryname;
	}


	public void setFoodcategoryname(String foodcategoryname) {
		this.foodcategoryname = foodcategoryname;
	}


	public String getFoodheader() {
		return foodheader;
	}


	public void setFoodheader(String foodheader) {
		this.foodheader = foodheader;
	}


	public String getFooddescription() {
		return fooddescription;
	}


	public void setFooddescription(String fooddescription) {
		this.fooddescription = fooddescription;
	}


	public double getFoodcost() {
		return foodcost;
	}


	public void setFoodcost(double foodcost) {
		this.foodcost = foodcost;
	}
	
	
	

}

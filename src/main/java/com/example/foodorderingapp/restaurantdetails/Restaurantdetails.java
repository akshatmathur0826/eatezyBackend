package com.example.foodorderingapp.restaurantdetails;

import com.example.foodorderingapp.malldetails.Malldetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Restaurantdetails {

	@Id
	private String restaurantid;
	
	@ManyToOne
    @JoinColumn(name = "mallid")
	private Malldetails malldetails;
	private String restaurantname;
	private String restaurantrating;
	private String restaurantimage;
	
	
	public Restaurantdetails()
	{}
	
	public Restaurantdetails(String restaurantid, Malldetails malldetails, String restaurantname,
			String restaurantrating, String restaurantimage) {
		super();
		this.restaurantid = restaurantid;
		this.malldetails = malldetails;
		this.restaurantname = restaurantname;
		this.restaurantrating = restaurantrating;
		this.restaurantimage = restaurantimage;
	}
	public String getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(String restaurantid) {
		this.restaurantid = restaurantid;
	}
	public Malldetails getMalldetails() {
		return malldetails;
	}
	public void setMalldetails(Malldetails malldetails) {
		this.malldetails = malldetails;
	}
	public String getRestaurantname() {
		return restaurantname;
	}
	public void setRestaurantname(String restaurantname) {
		this.restaurantname = restaurantname;
	}
	public String getRestaurantrating() {
		return restaurantrating;
	}
	public void setRestaurantrating(String restaurantrating) {
		this.restaurantrating = restaurantrating;
	}
	public String getRestaurantimage() {
		return restaurantimage;
	}
	public void setRestaurantimage(String restaurantimage) {
		this.restaurantimage = restaurantimage;
	}
	
	
	
	
	
}

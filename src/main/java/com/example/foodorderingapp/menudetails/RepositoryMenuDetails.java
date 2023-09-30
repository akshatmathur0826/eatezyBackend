package com.example.foodorderingapp.menudetails;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foodorderingapp.restaurantdetails.Restaurantdetails;


public interface RepositoryMenuDetails extends JpaRepository<Menudetails,String> {

	List<Menudetails> findByrestaurantdetails(Restaurantdetails restaurant);
}

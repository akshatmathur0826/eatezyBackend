package com.example.foodorderingapp.restaurantdetails;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.foodorderingapp.malldetails.Malldetails;

@Repository
public interface RepositoryRestaurantdetails extends JpaRepository<Restaurantdetails,String> {
	
	List<Restaurantdetails> findBymalldetails(Malldetails mall);
	
	@Query(value = "select r.restaurantimage from public.restaurantdetails as r where r.mallid = :mallid ", nativeQuery = true)
	List<String> getimage(@Param("mallid") String mallid);
}

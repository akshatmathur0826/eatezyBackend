package com.example.foodorderingapp.orderdetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryOrderDetails extends JpaRepository<OrderDetails,String>{

	@Query(value = "SELECT * FROM orderdetails where useremailid = :emailid  order by TO_TIMESTAMP(timeofplacingorder, 'DD/MM/YYYY HH24:MI:SS') desc LIMIT 1", nativeQuery = true)
	OrderDetails getOrderDetails(@Param("emailid") String emailid);

	@Query(value = "SELECT * FROM orderdetails where useremailid = :emailid  order by TO_TIMESTAMP(timeofplacingorder, 'DD/MM/YYYY HH24:MI:SS') desc", nativeQuery = true)
	List<OrderDetails> previousOrders(@Param("emailid") String emailid);

	
}

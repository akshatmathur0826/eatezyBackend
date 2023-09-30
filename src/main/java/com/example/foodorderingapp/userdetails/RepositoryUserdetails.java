package com.example.foodorderingapp.userdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUserdetails extends JpaRepository<Userdetails,String> {
	
	@Query(value = "Select addUser2(:fullname, :email, :password, :mobileno)", nativeQuery = true)
    String storeUserdetails(
        @Param("fullname") String fullname,
        @Param("email") String email,
        @Param("password") String password,
        @Param("mobileno") String mobileno
    );

	@Query(value = "SELECT userloginauthentication(:email, :password)", nativeQuery = true)
	String getUserDetails(  
			@Param("email") String email,
	        @Param("password") String password
	        );

}

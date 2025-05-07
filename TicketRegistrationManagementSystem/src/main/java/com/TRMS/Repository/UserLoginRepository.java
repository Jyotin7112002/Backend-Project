package com.TRMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.TRMS.Model.UserLogin;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin, String> {
	
	@Query("select u from UserLogin u where u.emailId=:email")
	public UserLogin findbyemail(@Param("email") String email);
	
}

package com.TRMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TRMS.Model.UserLogin;
import com.TRMS.Repository.UserLoginRepository;


@Service
public class UserLoginService {
	
	@Autowired
	private UserLoginRepository urepo;
	
	public UserLogin addUser(UserLogin user) {
		UserLogin u = urepo.save(user);
		System.out.println("Data is saved in Database...");
		return u;
		
		
	}

}

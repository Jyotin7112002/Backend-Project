package com.TRMS.Service;

import java.util.Iterator;
import java.util.List;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.TRMS.Model.UserLogin;
import com.TRMS.Repository.UserLoginRepository;

@Service
public class CustomerUserDatailsService implements UserDetailsService {
	
@Autowired
	private UserLoginRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserLogin ulogin= repo.findbyemail(email);
		System.out.println(ulogin);
		
		if(ulogin == null) {
			throw new UsernameNotFoundException("user is new");
		}
		
		List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_"+ulogin.getRole()));
		return new User(ulogin.getEmailId(),ulogin.getPassword(),authorities);
	}

}

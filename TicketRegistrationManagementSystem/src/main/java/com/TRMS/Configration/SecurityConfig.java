package com.TRMS.Configration;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import com.TRMS.Service.CustomerUserDatailsService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private CustomerUserDatailsService userDatailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception{
	return http.getSharedObject(AuthenticationManagerBuilder.class)
			.userDetailsService(userDatailsService)
			.passwordEncoder(passwordEncoder())
			.and()
			.build();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http.csrf().disable()
	        .authorizeHttpRequests()
	        .requestMatchers("/gotoform").permitAll() // Ensure login page is accessible
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
	        .loginPage("/gotoform") // Set custom login page
	        .loginProcessingUrl("/login") // Ensure form action matches this
	        .successHandler(customerAuthenticationSuccessHandler()) // Redirect after successful login
	        .permitAll()
	        .and()
	        .logout()
	        .logoutUrl("/logout")
	        .logoutSuccessUrl("/gotoform")
	        .permitAll();
	    return http.build();
	}

	
	@Bean
	public AuthenticationSuccessHandler customerAuthenticationSuccessHandler() {
	return (Request, response, authentication)->{
		String role = authentication.getAuthorities().stream()
				.map(auth-> auth.getAuthority())
				.findFirst()
				.orElse("");
		System.out.println("User role -> " + role);
		role=role.toUpperCase();
		if("ROLE_ADMIN".equals(role)) {
			response.sendRedirect("/adminpanel");
		}else if("ROLE_USER".equals(role)) {
			response.sendRedirect("/userpanel");
		}else {
			response.sendRedirect("/gotoform");
		}
		
		
	};
}
	
	@Bean
	public LogoutSuccessHandler logoutSuccessHandler() {
	return (request, response, authentication)->{
		
	}	;
	}
}

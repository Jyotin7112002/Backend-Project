package com.TRMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TRMS.Model.UserLogin;
import com.TRMS.Service.UserLoginService;

import jakarta.annotation.Resource;

@Controller
public class UserLoginController {

	@Autowired
	private UserLoginService userv;
	
	
	@RequestMapping("/gotoform")
	public String gotoform() {
		return "login";
	}
	
	@RequestMapping("/addnewuser")
	public String insertUser(@ModelAttribute UserLogin user) {
		UserLogin u = userv.addUser(user);
		return "login";
	}
	
	@RequestMapping("/userpanel")

	public String user() {
		return "userpanel";
	}
	
	@RequestMapping("/adminpanel")
	
	public String admin() {
		return "adminpanel";
	}
	
	@RequestMapping("/serv")
	public String Services() {
		return "service";
	}
	
	@RequestMapping("/select")
	public String selectBus() {
		return "busslection";
	}
	
	@RequestMapping("/userlogin")
	public String gotouserlogin() {
		return "newuser";
	}
	
}

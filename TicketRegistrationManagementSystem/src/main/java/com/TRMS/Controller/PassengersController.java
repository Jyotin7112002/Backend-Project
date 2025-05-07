package com.TRMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.TRMS.Model.Passengers;
import com.TRMS.Service.PassengersService;

@Controller
public class PassengersController {

	@Autowired
	private PassengersService serv;
	
	@RequestMapping("/insert")
	public String insertPass(@ModelAttribute Passengers p1, Model model) {
		serv.addPass(p1);
		model.addAttribute("bookinginfo", p1);
		return "ticket";
	}
	
	@RequestMapping("/myticket")
	public String ticketinfo() {
		return "checkUser";
	}
	
	@RequestMapping("/tinfo")
	public String ticketdata(@RequestParam("pemail") String email, Model model){
	Passengers p = serv.getSingle(email);
	if(p != null) {
	model.addAttribute("bookinginfo",p);
		return "ticket";
	}else {
		return "passnotfoundpage";
	}
	}

	@RequestMapping("/cancel")
	public String cancelTicket() {
		return "cancellation";
	} 
	
	@RequestMapping("/cticket")
	
	public String cancellation(@RequestParam("pemail")String email) {
		
		serv.delete(email);
		
		return "Ticancel";
	}
	
	@RequestMapping("/change/{pemail}")
	public String editTicket(@PathVariable("pemail")String email,Model model) {
		Passengers p1 =serv.getSingleData(email);
		System.out.println(p1);
		model.addAttribute("user",p1);
		return "editTicket";
	} 
	
	@RequestMapping("/edit")
	public String changeDate(@ModelAttribute Passengers p1,Model model) {
		System.out.println(p1);
		Passengers p2 =serv.update(p1);
		model.addAttribute("bookinginfo",p2);
		return "ticket";
	}
	
	}
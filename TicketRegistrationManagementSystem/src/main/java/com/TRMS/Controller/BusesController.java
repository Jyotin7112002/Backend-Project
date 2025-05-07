package com.TRMS.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TRMS.Model.Buses;
import com.TRMS.Service.BusesService;

@Controller
public class BusesController {

	@Autowired
	private BusesService serv;
	
	@RequestMapping("/busform")
	public String gotoBuses() {
		return "busesform";
	}
	
	@RequestMapping("/addb")
	public String addBus(@ModelAttribute Buses bus,Model model) {
		Buses b= serv.add(bus);
		model.addAttribute("bdata" , b);
		return "businfo";
	}
	
	@RequestMapping("/allbus")
	public String AllInfo(Model model) {
		List<Buses> list= serv.allData();
		model.addAttribute("adata",list);
		return "allBusData";
		}
	
	
}

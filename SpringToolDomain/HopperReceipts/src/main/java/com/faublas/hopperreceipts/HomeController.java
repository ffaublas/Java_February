package com.faublas.hopperreceipts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		//importing Model class and creating an instance of it
//		Model model = new Model()
		
		
		String customerName = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;		
		String description = "Metal strips. Also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		
		
		
		
		
		model.addAttribute("name", customerName);
		model.addAttribute("item", itemName);
		model.addAttribute("cost", price);
		model.addAttribute("desc", description);
		model.addAttribute("store", vendor);
		
		
		
		return "index.jsp";
		
		
	}

}

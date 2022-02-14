package com.faublas.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "OmiForm.jsp";
	}
	
	@PostMapping("/get_fortune")
	public String process(
			
			@RequestParam("number") Integer number,
			@RequestParam("city_name") String city_name,
			@RequestParam("real_name") String real_name,
			@RequestParam("hobby") String hobby,
			@RequestParam("living_thing") String living_thing,
			@RequestParam("something_nice") String something_nice,
			
			HttpSession session
			) {
		System.out.println("form submitted!!!!");
		
		session.setAttribute("number", number);
		session.setAttribute("city_name", city_name);
		session.setAttribute("real_name", real_name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living_thing", living_thing);
		session.setAttribute("something_nice", something_nice);
		
		return "redirect:/show";
		
	}
	
	@RequestMapping("/show")
	public String showDetails() {
		
		
		return "show.jsp";
	}
	
}

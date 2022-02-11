package com.faublas.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
	
	@RequestMapping("") 
	public String helloHuman() {
		return "Hello Human";
	}
	
	@RequestMapping("/")
	public String humanName(@RequestParam(value="fname", required=false) String firstname, @RequestParam(value="lname", required=false) String lastname) {
//		console.log("this is the query param!! " + )
		System.out.println("First name: " + firstname);
		if(firstname ==null) {
			return "Hello Human";
		}else if(lastname==null){
			return String.format(" Hello %s" , firstname );
		}
		else { 
			return String.format("Hello %s %s", firstname, lastname);
		}
	}

}

package com.faublas.daikichipathvariables;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class HomeController {

	@RequestMapping("")
	public String hello() {
		return "Welcome!"; 
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all of your endeavors!"; 
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!"; 
	}
	
	@RequestMapping("/travel/{city}")
	public String showCity(@PathVariable("city") String city){
		return String.format("Congratulations! You will soon travel to %s!" , city);
	}
	
	
	@RequestMapping("/lotto/{luckyNumber}")
	public String showPlayerInfo(@PathVariable("luckyNumber")int luckyNumber){
		if(luckyNumber % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
					
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
	}
}

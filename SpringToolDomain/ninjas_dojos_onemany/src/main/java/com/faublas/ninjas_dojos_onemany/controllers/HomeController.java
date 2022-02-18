package com.faublas.ninjas_dojos_onemany.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faublas.ninjas_dojos_onemany.models.Ninja;
import com.faublas.ninjas_dojos_onemany.models.Dojo;
import com.faublas.ninjas_dojos_onemany.services.AppService;


@Controller
public class HomeController {
	private final AppService appServ;

	public HomeController(AppService appServ) {
		this.appServ = appServ;
	}

	@RequestMapping("/")
	public String home(Model model) {
		// whenever you render a form, send an empty object to the form using the view
		// model so that the form can bind to the empty object and have it validations
		// and it can update that objects info from the form
		model.addAttribute("dojo", new Dojo());

		return "newDojo.jsp";
	}

	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			// if no form errors, create a Dojo by using the service
			this.appServ.createDojo(dojo);
			return "redirect:/";
		}

	}

	@RequestMapping("/ninjas/add")
	public String addNinja(Model model) {
		// pass an empty ninja obj to the form for the form to bind to and update its
		// information with
		model.addAttribute("ninja", new Ninja());

		// pass a list of all Dojos to the template so that the form can show all the
		// Dojos that the ninja can be added to
		model.addAttribute("alldojos", this.appServ.getAllDojos());

		return "newNinja.jsp";
	}

	// create a ninja when the form submits using post request
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "newNinja.jsp";
		} else {
			// if no errors in form, then create a ninja using the service
			Ninja newlyCreatedNinja = this.appServ.createNinja(ninja);
			System.out.println(newlyCreatedNinja.getDojo().getId());

			return "redirect:/dojos/" + newlyCreatedNinja.getDojo().getId();
		}

	}
	
	@RequestMapping("/dojos/{id}")
	public String showOneDojo(@PathVariable("id") Long id, Model model) {
		
		//get one team using the id from the path variable by requesting it from the service 
		Dojo showDojoTeam = this.appServ.getOneTeam(id);
		
		model.addAttribute("showDojoTeam", showDojoTeam);
		
		return "showOneDojo.jsp";
	}
	
	
	

	
}

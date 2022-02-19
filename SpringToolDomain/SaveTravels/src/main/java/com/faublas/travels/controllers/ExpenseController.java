package com.faublas.travels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.faublas.travels.models.ExpenseItem;
import com.faublas.travels.services.*;


@Controller // @controller means that this class can return jsp files as a response and it
			// can accept http requests
public class ExpenseController {

	// the controller speaks to the service to access data. Controller doesnt
	// directly access the data, it uses the service as a middleman (for
	// modularization purposes)
	private final ExpenseService expService;

	// initialize the constructor with the MenuItemService enabled
	public ExpenseController(ExpenseService expService) {
		this.expService = expService;
	}

	@RequestMapping("/expenseitems")
	public String index(Model model) { // Dependency injection of Model model-> this means that we are enabling this
										// index() method to have access to the View Model class to be able to pass data
										// to templates

		// System.out.println(this.menuService.allMenuItems());
		//
		// create a variable called allMenuItems that will store a List<MenuItem> and
		// set it equal to what the service returns which is a List<MenuItem>
		List<ExpenseItem> allExpenses = this.expService.allExpenses();
		//
		// model.addAttribute lets us pass data from the controller to the jsp file that
		// we render in this method
		model.addAttribute("allExpenses", allExpenses); // the word on the left side is what the HTML understands
		//
		// //send an empty MenuItem object to the form for the form to bind to
		model.addAttribute("expenseitem", new ExpenseItem());
		return "index.jsp";
	}

	// get info about one menu item by its id
	@RequestMapping("expenseitems/{id}")
	public String show(@PathVariable("id") Long id, Model model) {

		// retrieve expense item and put in variable
		ExpenseItem expenseItem = this.expService.findExpenseItem(id);

		model.addAttribute("expenseItem", expenseItem);

		return "oneItem.jsp";
	}

	// create a expense item (post submission of the form)
	@PostMapping("/expenseitem/create")
	public String create(@Valid @ModelAttribute("expenseitem") ExpenseItem expenseItem, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			// need to pass in all menu items again to the template since we are
			// re-rendering the template if there are validation errors
			List<ExpenseItem> allExpenses = this.expService.allExpenses();

			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		} else {
			this.expService.createExpenseItem(expenseItem);
			return "redirect:/expenseitems";
		}

	}

	@RequestMapping("/expenseitems/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		// get info about the expense item i want to edit by using the id in the route
		// path so I can pre-populate the edit form with this menu item's info.
		ExpenseItem itemToEdit = this.expService.findExpenseItem(id);

		model.addAttribute("itemToEdit", itemToEdit);

		return "edit.jsp";
	}

	@PutMapping("/expenseitems/update/{id}")
	public String update(@PathVariable("id") Long id,
			@Valid @ModelAttribute("itemToEdit") ExpenseItem expenseItemToEdit, BindingResult result) {

		// the @ModelAttributre("itemToEdit") needs to match the modelAttribute in the
		// edit form so we can get the menu item object from the form and store it in a
		// variable. If the result has errors (form was not filled out properly), then
		// we re -render the edit form
		if (result.hasErrors()) {

			return "edit.jsp";
		} else { // otherwise if there's no errors, we send the object to update to the service
					// and the service will talk to the repository to update that item

			this.expService.updateItem(expenseItemToEdit);

			return "redirect:/expenseitems"; // redirect to the menuitems page
		}

	}

	// for deleting routes, just make it a get request
	@RequestMapping("/expenseitems/delete/{id}")
	public String delete(@PathVariable("id") Long id) {

		// we collect the id of the item we want to delete using the @pathvariable(id),
		// and then we tell the service to delete something with this id
		this.expService.deleteItem(id);

		return "redirect:/expenseitems";
	}

}

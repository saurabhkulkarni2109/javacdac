package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;
import com.app.service.CustomerService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/customer")
public class CustomerController {

	//need to inject our customer service
	
	@Autowired
	private CustomerService customerService;

	/*
	 * public CustomerController(CustomerService customerService) { super();
	 * this.customerService = customerService; }
	 */
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		//get customer from service
		List<Customer>theCustomer = customerService.getCustomer();
		//add the customer to the model
		model.addAttribute("customers",theCustomer);
		return "list-customer";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		//create a model attribute to bind form data
		Customer theCustomer = new Customer();
		model.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer")Customer theCustomer) {
		//save the customer using our service
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId")int theId,Model themodel)
	{
//	get the customer from our service
		
		Customer theCustomer= customerService.getCustomer(theId);
		themodel.addAttribute("customer", theCustomer);
		return "customer-form";
	}
	@GetMapping("/showFormForDelete")
	public String showFormForDelete(@RequestParam("customerId")int theId)
	{
//	get the customer from our service
		
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
	
	
}

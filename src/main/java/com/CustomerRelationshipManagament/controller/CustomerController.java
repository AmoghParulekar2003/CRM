package com.CustomerRelationshipManagament.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

import com.CustomerRelationshipManagament.entity.Customer;
import com.CustomerRelationshipManagament.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/insert")      //REST API 1 -> insert customer into DB
	public String insertCustomer(@RequestBody Customer customer) {
		
		return customerService.insertCustomer(customer);
		
	}
	
	@GetMapping                //REST API 2 -> get all the customers from DB
	public List<Customer> getCustomerList() {
		
		return customerService.getCustomerList();
		
	}
	
	@GetMapping("/{id}")      //REST API 3 -> get customer from DB by ID
	public Customer getCustomerById(@PathVariable int id) {
		
		return customerService.getCustomerById(id);
		
	}
	
	@PutMapping             //REST API 4 -> update customer in DB
	public String updateCustomer(@RequestBody Customer customer) {
		
		return customerService.updateCustomer(customer);
				
	}
	
	@DeleteMapping("/{id}")   //REST API 5 -> delete customer from DB
	public String deleteCustomer(@PathVariable int id) {
		
		return customerService.deleteCustomerById(id);
		
	}
	
	@PostMapping          //REST API 6 -> insert multiple customers in DB
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		
		return customerService.insertMultipleCustomers(customers);
		
	}
	
	@GetMapping("/byfirstname/{firstName}")    //REST API 7 -> get all Customers having the given firstName
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
		
		return customerService.getCustomerByFirstName(firstName);
		
	}
	
	@GetMapping("/lessthan/{age}")       //REST API 8 -> get all customers having age lass than given value
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age) {
		
		return customerService.getCustomerByLessThanAge(age);
		
	}
	
	@GetMapping("/byage/{age}")      //REST API 9 -> get all customers having the mentioned age.
	public List<Customer> getCustomerByAge(@PathVariable int age) {
		
		return customerService.getCustomerByAge(age);
	
	}
	
	@GetMapping("/bylastname/{lastName}")    //REST API 10 -> get all Customers having the given lastName
	public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
		
		return customerService.getCustomerByLastName(lastName);
		
	}
	
	@GetMapping("/bymobilenumber/{mobileNumber}")    //REST API 11 -> get all Customers having the given mobileNumber
	public List<Customer> getCustomerByMobileNumber(@PathVariable String mobileNumber) {
		
		return customerService.getCustomerByMobileNumber(mobileNumber);
		
	}
	
	@GetMapping("/byemail/{email}")    //REST API 12 -> get all Customers having the given email
	public List<Customer> getCustomerByEmail(@PathVariable String email) {
		
		return customerService.getCustomerByEmail(email);
		
	}
	
	@PutMapping("/{id}")    //REST API 13 -> update firstName of customer
	public String updateFirstName(@PathVariable int id, @RequestBody Map<String, String> request) {
		
		String firstName = request.get("firstName");
		return customerService.updateFirstName(id, firstName);
		
	}
	
}

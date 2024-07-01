package com.CustomerRelationshipManagament.service;

import java.util.List;

import com.CustomerRelationshipManagament.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	
	List<Customer> getCustomerList();
	
	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomerById(int id);
	
	String insertMultipleCustomers(List<Customer> customers);
	
	List<Customer> getCustomerByFirstName(String firstName);
	
	List<Customer> getCustomerByLessThanAge(int age);
	
	List<Customer> getCustomerByAge(int age);
	
	List<Customer> getCustomerByLastName(String lastName);
	
	List<Customer> getCustomerByMobileNumber(String mobileNumber);
	
	List<Customer> getCustomerByEmail(String email);
	
	String updateFirstName(int id, String firstName);
	
}

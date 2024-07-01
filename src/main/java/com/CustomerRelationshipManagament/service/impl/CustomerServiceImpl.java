package com.CustomerRelationshipManagament.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CustomerRelationshipManagament.dao.CustomerDao;
import com.CustomerRelationshipManagament.entity.Customer;
import com.CustomerRelationshipManagament.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public String insertCustomer(Customer customer) {
		
		return customerDao.insertCustomer(customer);
				
	}

	@Override
	public List<Customer> getCustomerList() {
		
		return customerDao.getCustomersList();
		
	}

	@Override
	public Customer getCustomerById(int id) {
		
		return customerDao.getCustomerById(id);
	}

	@Override
	public String updateCustomer(Customer customer) {
		
		return customerDao.updateCustomer(customer);
		
	}

	@Override
	public String deleteCustomerById(int id) {
		
		return customerDao.deleteCustomerById(id);
		
	}

	@Override
	public String insertMultipleCustomers(List<Customer> customers) {

		return customerDao.insertMultipleCustomers(customers);
		
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		
		return customerDao.getCustomerByFirstName(firstName);
		
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {

		return customerDao.getCustomerByLessThanAge(age);
		
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		
		return customerDao.getCustomerByAge(age);
		
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		
		return customerDao.getCustomerByLastName(lastName);
		
	}

	@Override
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		
		return customerDao.getCustomerByMobileNumber(mobileNumber);
		
	}

	@Override
	public List<Customer> getCustomerByEmail(String email) {

		return customerDao.getCustomerByEmail(email);
	}

	@Override
	public String updateFirstName(int id, String firstName) {

		return customerDao.updateFirstName(id, firstName);
		
	}

	
}

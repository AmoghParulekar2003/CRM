package com.CustomerRelationshipManagament.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustomerRelationshipManagament.entity.Customer;


@Repository
public class CustomerDao {

	// Database code
	//@Autowired
	SessionFactory sf;

	public CustomerDao(SessionFactory sf) {
		super();
		this.sf = sf;
	}
	
	public String insertCustomer(Customer customer) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		// insert, update, delete -> you need to use Transaction
		//save method -> session
		session.save(customer);  // to insert data
		tr.commit();
		session.close();
		
		return "Customer inserted successfully";
		
	}
	
	public List<Customer> getCustomersList() {
		
		Session session = sf.openSession();
		
		return session.createQuery("from Customer").list();
		
	}
	
	public Customer getCustomerById(int id) {
		//get -> return null if object not found in DB
		//load -> return objectNotfoundException if object not found in DB
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		
		return customer;
		
	}
	
	public String updateCustomer(Customer customer) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		
		return "Customer updated successfully";
		
	}
	
	public String deleteCustomerById(int id) {
		
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();
		
		return "Customer deleted successfully";
	}
	
	public String insertMultipleCustomers(List<Customer> customers) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		for(Customer customer:customers) {
			session.save(customer);
		}
		
		tr.commit();
		session.close();
		
		return "Customers inserted successfully";
		
	}
	
	public List<Customer> getCustomerByFirstName(String firstName) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.firstName=:firstName", Customer.class);
		customers.setParameter("firstName", firstName);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByLessThanAge(int age) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.age<:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByAge(int age) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.age=:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByLastName(String lastName) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.lastName=:lastName", Customer.class);
		customers.setParameter("lastName", lastName);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.mobileNumber=:mobileNumber", Customer.class);
		customers.setParameter("mobileNumber", mobileNumber);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public List<Customer> getCustomerByEmail(String email) {
		
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c  where c.email=:email", Customer.class);
		customers.setParameter("email", email);
		List<Customer> list = customers.list();
		
		return list;
		
	}
	
	public String updateFirstName(int id, String firstName) {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		
		return "First Name Updated Successfully";
		
	}

	
}

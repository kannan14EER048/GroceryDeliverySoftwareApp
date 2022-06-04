package com.project.grocerystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.exception.ResourceNotFoundException;
import com.project.grocerystore.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepo; 

	
	public Customer addCustomer(Customer customer) {
		
		return customerRepo.save(customer);
		
	}

	public List<Customer> fetchAllCustomers() {
	
		return customerRepo.findAll();
	}

	public Customer updateCustomer(Long customerId, Customer customer) {
		Customer customerCopy=new Customer();
	try {
		//oreElseThrow(){
	//}
		
		customerCopy=customerRepo.findById(customerId).orElseThrow(() -> new ResourceNotFoundException("Customer","customerId", customerId));
	}finally {
		System.out.println("Customer ID is invalid!");
	}
		customerCopy.setContactNo(customer.getContactNo());
		customerCopy.setCustomerAddress(customer.getCustomerAddress());
		customerCopy.setCustomerEmail(customer.getCustomerEmail());
		customerCopy.setCustomerName(customer.getCustomerName());
		return customerRepo.save(customerCopy);
	
	}

	
	
	
}

package com.project.grocerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.service.CustomerServiceImpl;

@RestController
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;
	
	@PostMapping(value="/customeradd")
	public String addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "Customer details are successfully added!!!";	
	}
	
	@GetMapping(value="/showcustomers")
	public List<Customer> fetchAllCustomers() {
		return customerService.fetchAllCustomers();
		
	}
	
	@PutMapping("{customerId}")
	public ResponseEntity<Customer> updateEmployee(@PathVariable("customerId") Long customerId, @RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerService.updateCustomer(customerId, customer), HttpStatus.OK);

	}
	
	
}

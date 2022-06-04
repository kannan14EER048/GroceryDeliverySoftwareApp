package com.project.grocerystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.service.AdminServiceImpl;

@RestController
@CrossOrigin("*")
public class AdminController {
	@Autowired
	private AdminServiceImpl adminService;
	
	@PostMapping(value="/adminAddUser")
	public Customer addCustomers(@RequestBody Customer customer) {
		return adminService.addCustomers(customer);
		
	}

}

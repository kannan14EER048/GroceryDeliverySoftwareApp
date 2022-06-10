package com.project.grocerystore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.SpringBoot.Exception.ResourceNotFoundException;
import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;

	public Customer addCustomers(Customer customer) {

		return adminRepo.save(customer);
	}

	public void deleteCustomer(Long customerId) {

		adminRepo.findById(customerId);

		adminRepo.deleteById(customerId);

	}

}

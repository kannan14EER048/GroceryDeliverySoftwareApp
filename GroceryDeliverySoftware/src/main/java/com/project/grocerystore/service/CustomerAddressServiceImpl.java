package com.project.grocerystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocerystore.entity.CustomerAddress;
import com.project.grocerystore.repository.CustomerAddressRepository;

@Service
public class CustomerAddressServiceImpl {
	@Autowired
	private CustomerAddressRepository addressRepo;

	public CustomerAddress addAddress(CustomerAddress address) {
		
		return addressRepo.save(address);
	}

	public List<CustomerAddress> fetchAllAddresses() { //This method is not needed as we will fetch address using customerId
		
		return addressRepo.findAll();
	}

}

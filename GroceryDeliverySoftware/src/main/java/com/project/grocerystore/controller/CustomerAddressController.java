package com.project.grocerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.grocerystore.entity.CustomerAddress;
import com.project.grocerystore.service.CustomerAddressServiceImpl;

@RestController
@CrossOrigin("*")
public class CustomerAddressController {


	@Autowired
	private CustomerAddressServiceImpl addressService;
	
	@PostMapping(value="/address")
	public String createOrder(@RequestBody CustomerAddress address) {
		addressService.addAddress(address);
		return "Address has been addded Successfully!!!";	
	}
	
	@GetMapping(value="/showaddresses")
	public List<CustomerAddress> fetchAllAddresses() {
		return addressService.fetchAllAddresses();
		
	}
	
}

package com.project.grocerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocerystore.entity.GroceryItem;
import com.project.grocerystore.entity.Order;
import com.project.grocerystore.service.GroceryItemServiceImpl;

@RestController
@CrossOrigin("*")
public class GroceryItemController {
	@Autowired
	private GroceryItemServiceImpl groceryService;
	
	@PostMapping(value="/groceryItem")
	public String createOrder(@RequestBody GroceryItem item) {
		groceryService.addItems(item);
		return "Items added Successfully!!!";	
	}
	
	@GetMapping(value="/fetchitems")
	public List<GroceryItem> fetchAllItems() {
		return groceryService.fetchAllItems();
		
	}

}

package com.project.grocerystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.entity.Order;
import com.project.grocerystore.service.OrderServiceImpl;

@RestController
@CrossOrigin("*")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderService;
	

	@PostMapping(value="/order")
	public String createOrder(@RequestBody Order order) {
		orderService.createOrder(order);
		return "Order Placed Successfully!!!";	
	}
	
	@GetMapping(value="/showorders")
	public List<Order> showAllOrders() {
		return orderService.showAllOrders();
		
	}
	

}

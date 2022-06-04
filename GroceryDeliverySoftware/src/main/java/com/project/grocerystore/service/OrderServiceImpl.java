package com.project.grocerystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocerystore.entity.Customer;
import com.project.grocerystore.entity.Order;
import com.project.grocerystore.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	public Order createOrder(Order order) {
	
		return orderRepo.save(order);
	}

	public List<Order> showAllOrders() {
		
		return orderRepo.findAll();
	}

}

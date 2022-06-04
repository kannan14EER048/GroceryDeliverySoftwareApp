package com.project.grocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocerystore.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}

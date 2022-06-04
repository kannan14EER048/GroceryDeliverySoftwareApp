package com.project.grocerystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.grocerystore.entity.GroceryItem;
import com.project.grocerystore.repository.GroceryItemRepository;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

	@Autowired
	private GroceryItemRepository groceryItemRepo;

	public GroceryItem addItems(GroceryItem item) {

		return groceryItemRepo.save(item);

	}

	public List<GroceryItem> fetchAllItems() {
		
		return groceryItemRepo.findAll();
	}
}

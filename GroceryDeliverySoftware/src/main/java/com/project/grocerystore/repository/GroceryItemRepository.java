package com.project.grocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocerystore.entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long>{

}

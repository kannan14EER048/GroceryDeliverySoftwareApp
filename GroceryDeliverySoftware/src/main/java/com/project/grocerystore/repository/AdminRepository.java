package com.project.grocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocerystore.entity.Customer;

public interface AdminRepository extends JpaRepository <Customer,Long>{

}

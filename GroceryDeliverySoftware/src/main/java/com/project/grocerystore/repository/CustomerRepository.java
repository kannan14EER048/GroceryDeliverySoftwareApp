package com.project.grocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.grocerystore.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>  {

}

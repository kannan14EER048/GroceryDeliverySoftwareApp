package com.project.grocerystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.grocerystore.entity.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, String>{

}

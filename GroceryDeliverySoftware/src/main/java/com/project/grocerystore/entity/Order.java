package com.project.grocerystore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Order {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderNo;
	private int noOfItems;
	private int orderTotal;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<GroceryItem> groceryItem;

	public Order() {
		super();
	
	}

	public Order(long orderNo, int noOfItems, int orderTotal, Customer customer, List<GroceryItem> groceryItem) {
		super();
		this.orderNo = orderNo;
		this.noOfItems = noOfItems;
		this.orderTotal = orderTotal;
		this.customer = customer;
		this.groceryItem = groceryItem;
	}

	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<GroceryItem> getGroceryItem() {
		return groceryItem;
	}

	public void setGroceryItem(List<GroceryItem> groceryItem) {
		this.groceryItem = groceryItem;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", noOfItems=" + noOfItems + ", orderTotal=" + orderTotal + ", customer="
				+ customer + ", groceryItem=" + groceryItem + "]";
	}
	
}

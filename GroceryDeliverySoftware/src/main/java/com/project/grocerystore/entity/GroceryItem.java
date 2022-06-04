package com.project.grocerystore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GroceryItem {

	@Id
	private long serialNo;
	private String itemName;
	private long quantity;
	private double unitPrice;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;

	public GroceryItem() {
		super();
	}

	public GroceryItem(long serialNo, String itemName, long quantity, double unitPrice, Order order) {
		super();
		this.serialNo = serialNo;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.order = order;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "GroceryItem [serialNo=" + serialNo + ", itemName=" + itemName + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", order=" + order + "]";
	}


	
	
	
	
	
}

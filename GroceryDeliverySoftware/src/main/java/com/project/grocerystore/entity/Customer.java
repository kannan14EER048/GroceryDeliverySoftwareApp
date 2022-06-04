package com.project.grocerystore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long customerId;
	private String customerName;
	private String contactNo;
	private String customerEmail;

	@OneToMany(mappedBy = "customer")
	private List<Order> order;

	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;

	public Customer() {
		super();
	}

	public Customer(long customerId, String customerName, String contactNo, String customerEmail, List<Order> order,
			CustomerAddress customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNo = contactNo;
		this.customerEmail = customerEmail;
		this.order = order;
		this.customerAddress = customerAddress;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNo=" + contactNo
				+ ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress + ", order=" + order
				+ "]";
	}

}

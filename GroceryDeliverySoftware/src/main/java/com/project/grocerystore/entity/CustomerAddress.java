package com.project.grocerystore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerAddress {

	@Id
	private String doorNo;
	private String street;
	private String city;
	private String district;
	private long pincode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private Customer customer;

	public CustomerAddress() {
		super();

	}

	public CustomerAddress(String doorNo, String street, String city, String district, long pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CustomerAddress [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}

}

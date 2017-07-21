package com.cmss.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="ADDRESS")
public class Address {

	
	
	
	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private long addressid;
	
	
	
	@Column
	private String  street;
	
	
	@Column
	private String  city;
	
	
	@Column
	private String  state;
	
	
	@Column
	private String  zipcode;
	
	
	public Address(String street, String city, String state, String zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	
}

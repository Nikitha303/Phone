package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String contact1;
	private String contact2;
	private String contact3;
	@OneToOne(mappedBy ="mobile")
	Contact contact;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContact1() {
		return contact1;
	}
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	public String getContact2() {
		return contact2;
	}
	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}
	public String getContact3() {
		return contact3;
	}
	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}
	
	
}

package com.codesbyzhangpeng.thymelead.demo.model;

public class Employee {
	
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Employee() {}
	
	public Employee(int id, String firstName, String lastName, String email) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

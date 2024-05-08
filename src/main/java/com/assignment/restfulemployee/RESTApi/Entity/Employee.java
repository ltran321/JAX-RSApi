package com.assignment.restfulemployee.RESTApi.Entity;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String hire_date;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String firstName, String lastName, String email, String hire_date, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.hire_date = hire_date;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getHire_date() {
		return hire_date;
	}
	
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", hire_date=" + hire_date + ", salary=" + salary + "]";
	}
	
}

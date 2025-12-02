package com.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable {
	@Value("101")
	private int id;
	@Value("Rahul")
	private String name;
	@Value("23456")
	private double salary;

	// Reference Type
	@Autowired
	private Address address;

	public Employee() {
		System.out.println("Defalut Constructor");
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, Address address) {
		System.out.println("Employee With All fields");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	// @Autowired // CI
	public Employee(Address address) {
		System.out.println("Employee With Address");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set Name");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Set Salary");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		System.out.println("Set Address Called");
		this.address = address;
	}

}

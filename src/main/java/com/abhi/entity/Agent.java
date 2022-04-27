package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
@Id
private String id;
private String name;
private String role;
private String place;
private double salary;
public Agent() {
	super();
	// TODO Auto-generated constructor stub
}
public Agent(String id, String name, String role, String place, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.role = role;
	this.place = place;
	this.salary = salary;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Agent [id=" + id + ", name=" + name + ", role=" + role + ", place=" + place + ", salary=" + salary + "]";
}
}

package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Npackage {
@Id
private String pkgNo;
private String destination1;
private String destination2;
private String destination3;
private int duration;
private double price;
public Npackage() {
	super();
	// TODO Auto-generated constructor stub
}
public Npackage(String pkgNo, String destination1, String destination2, String destination3,
		int duration, double price) {
	super();
	this.pkgNo = pkgNo;
	this.destination1 = destination1;
	this.destination2 = destination2;
	this.destination3 = destination3;
	this.duration = duration;
	this.price = price;
}
public String getPkgNo() {
	return pkgNo;
}
public void setPkgNo(String pkgNo) {
	this.pkgNo = pkgNo;
}
public String getDestination1() {
	return destination1;
}
public void setDestination1(String destination1) {
	this.destination1 = destination1;
}
public String getDestination2() {
	return destination2;
}
public void setDestination2(String destination2) {
	this.destination2 = destination2;
}
public String getDestination3() {
	return destination3;
}
public void setDestination3(String destination3) {
	this.destination3 = destination3;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Npackage [pkgNo=" + pkgNo + ", destination1=" + destination1 + ", destination2=" + destination2
			+ ", destination3=" + destination3 + ", duration=" + duration + ", price=" + price + "]";
}

}

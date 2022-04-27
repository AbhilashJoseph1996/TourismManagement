package com.abhi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ppackage {
@Id
private String pkgNo;
private String pkgType;
private String destination1;
private String destination2;
private String destination3;
private int day;
private int night;
private double price;
public Ppackage() {
	super();
	// TODO Auto-generated constructor stub
}
public Ppackage(String pkgNo, String pkgType, String destination1, String destination2, String destination3, int day,
		int night, double price) {
	super();
	this.pkgNo = pkgNo;
	this.pkgType = pkgType;
	this.destination1 = destination1;
	this.destination2 = destination2;
	this.destination3 = destination3;
	this.day = day;
	this.night = night;
	this.price = price;
}
public String getPkgNo() {
	return pkgNo;
}
public void setPkgNo(String pkgNo) {
	this.pkgNo = pkgNo;
}
public String getPkgType() {
	return pkgType;
}
public void setPkgType(String pkgType) {
	this.pkgType = pkgType;
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
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getNight() {
	return night;
}
public void setNight(int night) {
	this.night = night;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Ppackage [pkgNo=" + pkgNo + ", pkgType=" + pkgType + ", destination1=" + destination1 + ", destination2="
			+ destination2 + ", destination3=" + destination3 + ", day=" + day + ", night=" + night + ", price=" + price
			+ "]";
}
}

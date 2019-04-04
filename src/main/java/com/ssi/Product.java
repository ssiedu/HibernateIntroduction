package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {
	@Id
	private int pcode;
	private String pname;
	private int price;
	
	public Product() {
		super();
	}
	public Product(int pcode, String pname, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price="
				+ price + "]";
	}
	
	
}

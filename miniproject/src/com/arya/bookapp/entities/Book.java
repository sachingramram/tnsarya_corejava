package com.arya.bookapp.entities;

public class Book {
  private int id;
  private String name;
  private float price;
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
  
}

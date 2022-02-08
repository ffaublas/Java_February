package com.Faublas.OOPIntroStocks_Portfolio;

public class Stock {
	//constructor is a method that lets you define how to initialize the class
	public Stock() {
		
	}
	
	//overloading the constructor (aka creating another constructor with same exaact name) so that we can create (construct) a stock
	public Stock(String name, double price) {
		this.name = name;
		this.price = price;
	}
	

	//name
	public String name;
	
	//price
	public double price; 
}

package com.Faublas.OOPIntroStocks_Portfolio;

import java.util.ArrayList;

public class Portfolio {
	//Static variables are referenced from the class level (meaning that we don't need to create an instance of the class to access the method
	public static int numberOfAccountsCreated = 0;
	
	//empty constructor
	public Portfolio() {
		this.name = "Guest User";
		numberOfAccountsCreated++;
		
	}
	
	//loaded constructor
	public Portfolio(String name) {
		this.name = name; 
		numberOfAccountsCreated++;
	}
	
	
	public void addOneStock(Stock stockobj) {
		this.stocks.add(stockobj);
	}
	//name of owner
	public String name;
	
	//totalBalance
	public double totalBalance;
	
	//isDiamondHands
	public boolean isDiamondHands;
	
	//list of stocks
	public ArrayList<Stock> stocks = new ArrayList<Stock>();

}


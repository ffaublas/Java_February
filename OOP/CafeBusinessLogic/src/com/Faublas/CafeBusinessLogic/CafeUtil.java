package com.Faublas.CafeBusinessLogic;

import java.util.ArrayList;

public class CafeUtil {
	
	public void testing() {
		System.out.println("testing");
	}
	
	public int getStreakGoal(int numWeeks) {
		int total = 0;
		
		for(int i = 1; i<=10; i++) {
			total +=i;
		}
		
		return total; 
		
	}
	//double getOrderTotal(double[] prices)
	//Given an array of item prices from an order, sum all of the prices in the array and return the total.
	public double getOrderTotal(double[] prices) {
		double total = 0;
		
		//This is the Enhanced For Loop
//		for(double singleItemPrice : prices) {
//			total += singleItemPrice;
//		}
		
		for(int i = 0; i<prices.length; i++) {
			total += prices[i];
		}
		
		return total;
	}

	//Given an ArrayList of menu items (strings), print out each index and menu item.
	
	public void displayMenu(ArrayList<String> menuItems) {
		
		for(int i = 0; i<menuItems.size(); i++) {
//			System.out.println(i);
//			System.out.println(menuItems.get(i));
			
			//or
			
//			System.out.printf("%s %s \n",i,menuItems.get(i));
			
			//or
			
			System.out.println(String.format("%s %s",i,menuItems.get(i) ));
			
		}
	}
	
}
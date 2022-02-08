package com.Faublas.OOPIntroStocks_Portfolio;

public class PortfolioStockText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello OOP Intro");
		
		Stock stock1 = new Stock();
		Stock stock2 = new Stock();
		Stock stock3 = new Stock();
		Stock stock4 = new Stock("Tesla", 950.00);
		
		stock1.name = "MARA";
		stock2.name = "Apple";
		stock3.name = "Novavax";
		
		stock1.price = 24.99;
		stock2.price = 170.99;
		stock3.price = 88.59;
		
		System.out.println(String.format("Stock 1 info: Name- %s. Price: %s", stock1.name, stock1.price));
		
		Portfolio portfolio1 = new Portfolio();
		Portfolio portfolio2 = new Portfolio("rob");
		
		portfolio1.name = "Fritz";
		portfolio1.totalBalance = 100;
		portfolio1.isDiamondHands = false;
		portfolio1.stocks.add(stock1);
		portfolio1.stocks.add(stock2);
		portfolio1.addOneStock(stock4);
		
		
		System.out.println(String.format("Portfolio info: Owner: %s", portfolio1.name));
		
	}

}

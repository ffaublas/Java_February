package com.faublas.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla(){
		super();
	}
	
	
	public void throwSomething() {		
		System.out.println("Holy Crap!!! The Gorilla is throwing stuff at us! Minus 5 points.");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {		
		System.out.println("Harry Potter successfully fed the beast.  Awarded 10 points to Gryffindor!");
		this.energyLevel += 10;
	}
	
	public void climb() {		
		System.out.println("Poor Gorilla depleted 10% of his energy climbing a tree. Minus 10 points");
		this.energyLevel -=10;
	}

}

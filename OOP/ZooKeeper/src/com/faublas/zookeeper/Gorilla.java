package com.faublas.zookeeper;

public class Gorilla extends Mammal {
	
	
	
	public void throwSomething() {
		this.energylevel -= 5;
		System.out.println("Holy Crap!!! The Gorilla is throwing stuff at us! Minus 5 points.");
	}
	
	public void eatBananas() {
		this.energylevel += 10;
		System.out.println("Harry Potter successfully fed the beast.  Awarded 10 points to Gryffindor!");
	}
	
	public void climb() {
		this.energylevel -=10;
		System.out.println("Poor Gorilla depleted 10% of his energy climbing a tree. Minus 10 points");
	}

}

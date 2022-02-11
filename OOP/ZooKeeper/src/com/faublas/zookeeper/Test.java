package com.faublas.zookeeper;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hello Tarzan");
		System.out.println();
		
		System.out.println("Tarzan the Gorilla's Display of Energy Levels");
		Gorilla Tarzan = new Gorilla();
		
		Tarzan.throwSomething();
		Tarzan.throwSomething();
		Tarzan.throwSomething();
		Tarzan.eatBananas();
		Tarzan.eatBananas();
		Tarzan.climb();
		System.out.println("Tarzan's Energy Level at the end of the day: " + Tarzan.getEnergyLevel());
		System.out.println();
		
		System.out.println("Belfrey the Bat's Display of Energy Levels");
		Bat Belfrey = new Bat(300);
		
		Belfrey.attackTown();
		Belfrey.attackTown();
		Belfrey.attackTown();
		Belfrey.eatHumans();
		Belfrey.eatHumans();
		Belfrey.fly();
		Belfrey.fly();
		System.out.println("Belfrey's Energy Level at the end of the day: " + Belfrey.getEnergyLevel());
		

		

	}
	
}

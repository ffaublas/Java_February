package com.faublas.zookeeper;

public class Bat extends Mammal {
	
//	private int attackTown;
	
	public Bat(){
		
	}
	
	// loaded constructor
	public Bat(int energyLevel){
		this.energyLevel = energyLevel;
	}
	
	public void fly() {		
		System.out.println("Yerrrrrrrrrrrr! I'm coming for your town");
		this.energyLevel -= 50; 
	}
	
	public void eatHumans() {		
		System.out.println("I save the eyeballs for last.");
		this.energyLevel += 25;
	}
	
	public void attackTown() {		
		System.out.println("Skidoosh. Burning carbs while I burn your town down");
		this.energyLevel -= 100; 
	}
}

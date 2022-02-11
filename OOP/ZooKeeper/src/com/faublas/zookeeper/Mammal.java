package com.faublas.zookeeper;

public class Mammal {
	
	//member variable 
	protected int energyLevel = 100;
	
	public Mammal() {
		super();
	}
		
	//Loaded constructor
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	
	//Getters and Setters

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergylevel(int energylevel) {
		this.energyLevel = energylevel;
	}
	
	//Method
	public int displayEnergy() {
		System.out.println("Level Up!!!!  Current Energy level is: " + this.energyLevel);
		return this.energyLevel;
	}

}

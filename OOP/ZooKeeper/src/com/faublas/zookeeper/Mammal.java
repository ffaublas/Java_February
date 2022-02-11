package com.faublas.zookeeper;

public class Mammal {
	
	//member variable 
	protected int energylevel = 100;
	
	
	//Getters and Setters

	public int getEnergylevel() {
		return energylevel;
	}

	public void setEnergylevel(int energylevel) {
		this.energylevel = energylevel;
	}
	
	//Method
	public int displayEnergy() {
		System.out.println("Level Up!!!!");
		return this.energylevel;
	}

}

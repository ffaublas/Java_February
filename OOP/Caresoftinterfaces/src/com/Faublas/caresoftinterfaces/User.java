package com.Faublas.caresoftinterfaces;

public class User {
	protected Integer id;
    protected int pin;

    //good practice to have an empty constructor available 
    public User() {
    	
    }

  //loaded constructor
	public User(Integer id) {
		this.id = id;
	}

	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
        
    
}

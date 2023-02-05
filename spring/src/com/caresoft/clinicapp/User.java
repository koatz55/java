package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // Implement a constructor that takes an ID
    public User(Integer id) {
    	this.id = id;
    }
	    // TO DO: Getters and setters
	    public Integer getId() {
	    	return id;
	    }
	    public void setId(Integer number) {
	    	this.id = number;
	    }
	    
	    public int getPin() {
	    	return pin;
	    }
	    public void setPin(int number) {
	    	this.pin = number;
	    }
}
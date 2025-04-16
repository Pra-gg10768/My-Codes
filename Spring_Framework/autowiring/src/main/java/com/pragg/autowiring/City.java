package com.pragg.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class City {
	private int id; 
    private String name; 
    private State s; 
    
    public int getID() { 
    	return id; 
    	} 
    public void setId(int eid) {
    	this.id = eid; 
    	} 
    public String getName() {
    	return name; 
    	} 
    public void setName(String st) { 
    	this.name = st;
    	} 
    public State getState() { 
    	return s;
    	} 
    @Autowired 
    public void setState(State sta){ 
    	
        this.s = sta; 
    } 
    public void showCityDetails() 
    { 
        System.out.println("City Id : " + id); 
        System.out.println("City Name : " + name); 
        System.out.println("State : " + s.getName()); 
    } 
	
}

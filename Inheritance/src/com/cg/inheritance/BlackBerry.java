package com.cg.inheritance;

public class BlackBerry extends Mobile {

	public BlackBerry(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
		
	}
	public String getModel(){
		return "This is Superclass method: " + this.model;
	}
	
}

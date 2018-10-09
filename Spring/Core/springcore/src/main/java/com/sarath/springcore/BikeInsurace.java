package com.sarath.springcore;

public class BikeInsurace implements Insurance {

	@Override
	public String showStatus(String vechileNo) {
		
		return "Your Bike:"+vechileNo+" is Insured";
	}

}

package com.sarath.springcore;

import org.springframework.stereotype.Component;

@Component
public class CarInsurance implements Insurance {

	@Override
	public String showStatus(String vechicleNo) {
		return "Your Car:"+vechicleNo+" is Insured";
	}
	
}

package com.sarath.config;

import org.springframework.context.annotation.Bean;

import com.sarath.springcore.BikeInsurace;
import com.sarath.springcore.CarInsurance;

public class LearningConfig {

	@Bean
	public CarInsurance getCarInsurance() {
		return new CarInsurance();
	}
	
	@Bean
	public BikeInsurace getBikeInsurance() {
		return new BikeInsurace();
	}
}

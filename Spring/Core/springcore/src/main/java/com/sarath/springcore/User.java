package com.sarath.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sarath.config.LearningConfig;

public class User {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(LearningConfig.class);
		ctx.refresh();

		System.out.println(ctx.getBean(CarInsurance.class).showStatus("KL18 EU 2870"));
		System.out.println(ctx.getBean(BikeInsurace.class).showStatus("KA 03 EU 9120"));
		
		ctx.close();
	}
}

package com.sarath.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sarath.config.SpringJdbcConfig;
import com.sarath.dao.EmployeeDao;
import com.sarath.model.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringJdbcConfig.class})
//@SpringBootTest(classes={SpringJdbcConfig.class})

//The below annotations are needed in case of auto configuration.

@SpringBootApplication
//The above three annotations together is same as @SpringBootApplication.
//@SpringBootApplication(scanBasePackages = {"edu.aspire.daos"})
//Note: It is good practice to add these annotations in spring configuration file if exists.
public class SpringJdbcTest {
	@Autowired
	ApplicationContext context;
	@Test
	public void testSpringJdbc() {
		
		EmployeeDao empdao = (EmployeeDao)context.getBean("employeeDAO");		
		Employee e = new Employee();
		e.setEname("Ramesh");
		e.setDesig("Director");
		e.setSal(1000.0);
		empdao.save(e);
		System.out.println("Record inserted successfully...");
		
	}
}

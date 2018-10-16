package com.sarath.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sarath.dao.EmployeeDao;
import com.sarath.dao.EmployeeDaoImpl;


@SpringBootConfiguration
public class SpringJdbcConfig {
	@Bean
	public DataSource dataSource() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("org.sqlite.JDBC");
		bds.setUrl("jdbc:sqlite:C:\\PlayGround\\project\\OnlineTraining\\Spring\\Boot\\boot-parent\\SpringJdbcBoot\\boot.db");
		bds.setUsername("");
		bds.setPassword("");
		bds.setInitialSize(10);
		bds.setMaxActive(15);
		return bds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean(name = "employeeDAO" )
	public EmployeeDao empDao(){
		return new EmployeeDaoImpl();
	}
}

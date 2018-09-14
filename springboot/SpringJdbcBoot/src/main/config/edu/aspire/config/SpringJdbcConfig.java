package edu.aspire.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import edu.aspire.daos.EmployeeDao;
import edu.aspire.daos.EmployeeDaoImpl;

@SpringBootConfiguration
//@ComponentScan(basePackages = {"edu.aspire.daos"})
public class SpringJdbcConfig {
	@Bean
	public DataSource dataSource() {
		BasicDataSource bds = new BasicDataSource();
		/*bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3305/Aspire?useSSL=false");
		bds.setUsername("root");
		bds.setPassword("root");*/
		bds.setDriverClassName("org.sqlite.JDBC");
		bds.setUrl("jdbc:sqlite:D:\\Learning\\Installed Softwares\\Database\\SQLiteStudio\\aspire");
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
	
	@Bean(name = "empdao" )
	public EmployeeDao empDao(){
		return new EmployeeDaoImpl();
	}
}

package edu.aspire.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootConfiguration
@ComponentScan(basePackages = { "edu.aspire.model", "edu.aspire.services" })
@EnableAutoConfiguration
public class AspireRootConfig {
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource ds) {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(ds);

		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		//props.put("hibernate.format_sql", "true");
		//props.put("hibernate.use_sql_comments", "true");
		//props.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
		props.put("hibernate.hbm2ddl.auto", "create-drop");
		//props.put("hibernate.dialect", "com.enigmabridge.hibernate.dialect.SQLiteDialect");
		//props.put("hibernate.dialect", "org.hibernate.dialect.SQLiteDialect");
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		
		//spring.jpa.properties.hibernate.dialect = 

		lsfb.setHibernateProperties(props);
		lsfb.setMappingResources(new String[] { "Customer.hbm.xml" });

		return lsfb;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public HibernateTemplate hibernateTemplate() {
		return new HibernateTemplate();
	}
}

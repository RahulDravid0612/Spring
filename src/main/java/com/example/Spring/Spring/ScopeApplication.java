package com.example.Spring.Spring;


import com.example.Spring.Spring.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.Spring.Spring.scope")
public class ScopeApplication {

   private static Logger LOGGER= LoggerFactory.getLogger(ScopeApplication.class);
	public static void main(String[] args)
	{


		ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
	}
}

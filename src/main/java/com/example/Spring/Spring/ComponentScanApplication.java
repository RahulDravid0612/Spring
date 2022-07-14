package com.example.Spring.Spring;


import com.example.Spring.Component.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.Spring.Component")
public class ComponentScanApplication {

   private static Logger LOGGER= LoggerFactory.getLogger(ComponentScanApplication.class);
	public static void main(String[] args)
	{


		ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);
		ComponentDAO componentDAO=applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDAO);

	}
}

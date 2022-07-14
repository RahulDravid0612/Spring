package com.example.Spring.Spring;


import com.example.Spring.Spring.cdi.SomeCdiDeo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.Spring.Spring.cdi")
public class CdiApplication {

   private static Logger LOGGER= LoggerFactory.getLogger(CdiApplication.class);
	public static void main(String[] args)
	{


		ApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args);
		SomeCdiDeo someCdiDeo=applicationContext.getBean(SomeCdiDeo.class);

		LOGGER.info("{}",someCdiDeo);

	}
}

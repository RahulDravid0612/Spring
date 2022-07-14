package com.example.Spring.Spring;

import com.example.Spring.Spring.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.Spring.Spring.basic")
public class BasicApplication {

	public static void main(String[] args)
	{
	//	BinarySearchImpl binarySearch=new BinarySearchImpl(new QuickSortAlgorithm());

		ApplicationContext applicationContext = SpringApplication.run(BasicApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		int result=binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
	}
}

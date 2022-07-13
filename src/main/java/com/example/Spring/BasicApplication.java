package com.example.Spring;

import com.example.Spring.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
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

package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c1 = new AnnotationConfigApplicationContext(Javaconfig.class);
		
		         Student sc = c1.getBean("getStudent",Student.class);
		         
		         System.out.println(sc);
	}

}

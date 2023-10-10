package com.spring.remove.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig 
{
	@Bean
	public Samosa getSamosa()
	{
		
		return new Samosa();
	}
	
	@Bean
	public Student getStudent()
	{
		//create a new student object
		Student student = new Student(getSamosa());
		
		return student;
	}

}

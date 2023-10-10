package com.spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig 
{
	@Bean
	public Student getStudent()
	{
		Student s1 = new Student();
		return s1;
	}

}

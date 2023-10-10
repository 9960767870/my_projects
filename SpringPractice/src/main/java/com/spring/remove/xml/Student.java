package com.spring.remove.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Student
{
	private Samosa samosa;
	
	
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}



	public void study()
	{
		this.samosa.display();
		System.out.println("I am reading a book");
	}

}

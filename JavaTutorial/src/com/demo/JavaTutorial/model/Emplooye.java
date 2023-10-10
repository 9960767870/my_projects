package com.demo.JavaTutorial.model;

public class Emplooye {

	int id;
	String name;
	float salary;

	void insert(int i, String n, float s) {

		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + "" + name + "" + salary);
	}

	public static void main(String[] args) {

		Emplooye e1 = new Emplooye();

		e1.insert(246, "rushi", 20000);

		e1.display();
	}

}

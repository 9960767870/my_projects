package com.demo.JavaTutorial.model;

public class Method {

	int intMethod() {
		return 20;
	}

	byte byteMethod() {
		return 127;
	}

	float floatMethod() {
		return 3.14f;
	}

	boolean booleanMethod() {
		return true;
	}

	long longMethod() {
		return 9960767870l;
	}

	char charMethog() {
		return 'r';
	}

	String StringMethod() {
		return "rushi";
	}

	int[] arrayMethod() {
		int[] arrayexample = { 1, 2, 3, 4, 5, 6, 7 };
		return arrayexample;
	}

	void display() {
		for (int a=0;a<arrayMethod().length;a++) {
			System.out.print( arrayMethod()[a] + "\t");

		}
	}

	public static void main(String[] args) {

		Method obj1 = new Method();

		obj1.display();
	}

}

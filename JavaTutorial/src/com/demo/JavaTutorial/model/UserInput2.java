package com.demo.JavaTutorial.model;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" subject marks " );

		System.out.println("1st subject of marks");
		int sub1 = sc.nextInt();
		System.out.println("2nd subject of marks");
		int sub2 = sc.nextInt();
		System.out.println("3rd subject of marks");
		int sub3 = sc.nextInt();
		System.out.println("4th subject of marks");
		int sub4 = sc.nextInt();
		System.out.println("5th subject of marks");
		int sub5 = sc.nextInt();

		int f = sub1 + sub2 + sub3 + sub4;
		System.out.println("percentage(%) of f is:");
		float g = f*100/500;
		System.out.println("value of g is: "+ g);
		System.out.println(f);

		System.out.println("sub1: " + sub1);
		System.out.println("sub2:" + sub2);
		System.out.println("sub3:" + sub3);
		System.out.println("sub4:" + sub4);
		System.out.println("sub5:" + sub5);

	}
}

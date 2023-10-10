package com.demo.JavaTutorial.model;

import java.util.Scanner;

public class UserInPut {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		{

			System.out.println("enter your name");
			String name = s1.next();

			System.out.println("enter your age");
			int age = s1.nextInt();

			System.out.println("enter your gender");
			char gender = s1.next().charAt(0);

			System.out.println("enter your phone no");
			long phoneno = s1.nextLong();

			System.out.println("name:" + name);
			System.out.println("age:" + age);
			System.out.println("gender:" + gender);
			System.out.println("phoneno:" + phoneno);

		}
	}
}
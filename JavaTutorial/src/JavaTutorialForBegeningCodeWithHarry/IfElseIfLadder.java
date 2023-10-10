package JavaTutorialForBegeningCodeWithHarry;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		int age;

		System.out.println("Enter your age");

		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		if (age > 56) {
			System.out.println("you are exprienced");
		}

		else if (age > 46) {
			System.out.println("you are semi-exprienced");
		}

		else if (age > 36) {
			System.out.println("you are semi-semi-exprienced");
		}

		else {
			System.out.println("you are not exprienced");

		}
	}
}

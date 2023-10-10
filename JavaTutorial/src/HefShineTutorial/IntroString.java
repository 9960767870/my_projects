package HefShineTutorial;

import java.util.Scanner;

public class IntroString {
	
	void inputElement() {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the size of array"); 
		
		int size = sc.nextInt();
		
		int number[] = new int[size];
		System.out.println("Enter Element" + size);
		
		for(int i=0;i<size;i++) {
			number[i] = sc.nextInt();
		}
		
		display(sumofInputElement(number ,size));
	}	
	int	 sumofInputElement(int number[],int size) {
			
		    int result = 0;
		    for(int i=0;i<size;i++) {
		    	result = result+number[i];
		    }
		    return result;
		}
	
	void display(int result) {
		System.out.println("The sum of array element is:"+result);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntroString is = new IntroString();
		is.inputElement();

	}

}

package JavaTutorialForBegeningCodeWithHarry;

import java.util.Scanner;

public class Nested_try_catch {
    	
    	public static void main(String[] args) {
    		
    		int[] marks = new int[3];
    		
    		marks[0] = 10;
    		marks[1] = 20;
    		marks[2] = 30;
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("The arraay of index");
    		int ind = sc.nextInt();
			
    		try {
    			System.out.println("Welcome to eclipse");
    			
    		try {
    			System.out.println(marks[ind]);
    		}
    		
    		catch(ArrayIndexOutOfBoundsException e) {
    			
    			System.out.println("sorry this index does not exist");
    			System.out.println("Exception level 2");
    			
    		}
    		
    		}
    		
    		catch(Exception e) {
    			System.out.println("Exception level 1");
    			
    		}
    			
    		}                                                   
		}


  
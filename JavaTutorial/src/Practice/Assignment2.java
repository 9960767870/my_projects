package Practice;

import java.util.Arrays;

public class Assignment2 {
	
	public int[] a = new int[4];
	int index = 0;
	
	public void push(int num) {
		if(index<a.length) {
			a[index++]=num;
		}
		else {
			System.out.println("stack is full");
		}
	}
	
	public int pop() {
		
		 index--;
		
	    return a[index];
	
		}	
	public void print() {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 a =new Assignment2();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		a.print();
		System.out.println(a.pop());
		

	}

}

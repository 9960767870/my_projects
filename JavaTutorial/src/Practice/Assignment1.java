package Practice;

import java.util.Arrays;

public class Assignment1 {
	static int[] a = new int[5];
	
	static int index = 0;
	
	public static void push(int num) {
		if(index<a.length) {
			a[index++]=num;
		}
		else {
			System.out.println("Queue is full");
		}
			
	}
	
	public static int pop() {
		int temp = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(index>0) {
			a[i-1]=a[i];
			}
			
			else {
				if(index==0)
				System.out.println("queue is empty");
				return 0;
			}
			
		
	}
		index--;
		return temp;
	}
	public static void print() {
		System.out.println(Arrays.toString(a));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		print();
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
		
		
	}

}

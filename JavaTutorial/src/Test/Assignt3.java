package Test;

public class Assignt3 {
	
	static int[] a = new int[5];
	static int index = 0;
	public static void push(int num) {

		if(index<a.length) {
			
			a[index]=num;
			index++;
		}
		else {
			System.out.println("static is full");
		}
	}
	
		
		public static int pop() {
			if(index==0) {
			System.out.println("static is empty");
			return 0;
		}
			else {
				index--;
				 return a[index];
			}
			
		}
			
		
		public static void display() {
			for (int i = 0; i < index; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         display();
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
//		push(60);
		display();
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
	}

}

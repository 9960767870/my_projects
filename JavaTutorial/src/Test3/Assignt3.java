package Test3;

public class Assignt3 {
	static int[] a = new int[4];
	static int index = 0;
	
	public static void push(int num) {
		if(index<a.length) {
			a[index++]=num;
		}
		else {
			System.out.println("queue is full");
		}
		
	}
	
	public static int pop() {
		if(index==0) {
			System.out.println("queue is full");
			return 0;
		}
		
		else {
			int temp = a[0];
			for (int i = 1; i < a.length; i++) {
			 
				a[i-1]=a[i];
					
			}
			index--;
			return temp;
		}
		
	}
	
	public static void print() {
		
		for (int i = 0; i < index; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     push(10);
	     push(20);
	     push(30);
	     push(40);
	     print();
	     System.out.println();
	     System.out.println(pop());
	     System.out.println(pop());
	     System.out.println(pop());
 
	}

}

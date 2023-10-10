package Collection;

import java.util.Stack;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(200);
		s.push(30);
		s.pop();
		
		System.out.println(s.peek());
		System.out.println(s);

	}

}

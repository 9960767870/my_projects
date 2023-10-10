package JavaTutorialForBegeningCodeWithHarry;

   import java.util.LinkedList;
 
  public class LinkedList_Example {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(8);
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(0, 10);
		list.add(0, 1);
		
		list.addAll(list2);
		
		list.set(1, 566);
		
		list.addFirst(100);
		list.addLast(200);
		
		
		
		
		System.out.print(list.contains(10));
		
		System.out.print(list.indexOf(15));
		
		System.out.print(list.lastIndexOf(20));
		
		
		
		for(Integer a : list) {
			System.out.print( a);
			
			System.out.print(",");
			
			list.element();
			System.out.println(list);

}
	}
  }

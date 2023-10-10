package HefShineTutorial;

public class ArrayDemo {

	public static void main(String[] args)
    {
	
          // anonymous array
          sum(new int[]{ 1, 2, 3 });
		
    }
    private static int method1() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void sum(int[] a)
    {
        int total = 0;
  
        // using for-each loop
        for (int i : a) 
            total = total + i;
          
        System.out.println("The sum is:" + total);
    }
}

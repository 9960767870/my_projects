package Multithreading;

public class Myclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Synchronized1 s1 = new Synchronized1();
		
       Synchronized2  s2 = new Synchronized2();
       
       s1.start();
       s2.start();
       
       s1.join();
       s2.join();
       
       System.out.println(Abcd.i);
	}

}

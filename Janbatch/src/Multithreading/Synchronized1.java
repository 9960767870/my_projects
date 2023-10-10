package Multithreading;

public class Synchronized1 extends Thread {

		@Override
		public void run() {
		
			for (int i = 0; i <100000; i++) {
				
				Abcd.add();
			}
		}
	}




package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		for(int i=0;i<5;i++) {
			v.addElement(i);
			
		}
		System.out.println("Vector objects:"+v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			
			if(i%2==0) {
				System.out.println("Even are:"+i);
			}
		}
		System.out.println(v);
	}

}

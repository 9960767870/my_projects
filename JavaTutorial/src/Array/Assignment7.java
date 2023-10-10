package Array;

import java.nio.channels.AcceptPendingException;

public class Assignment7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 char[] a = {'R','S','I','E','H'};
		 char[] b = {'U','H','K','S'};
		 
		 char[] c = new char[a.length+a.length];
		 int cindex =0;
		 
		 for(int i=0;i<c.length;i++) {
			 if(i<a.length) {
				 c[cindex++]=a[i];
			 }
			if(i<b.length) {
			c[cindex++]=b[i];
			}
		 }
		 for(int i=0;i<c.length;i++) {
			 
			 System.out.print(c[i]+" ");
		 }
		
	}

}

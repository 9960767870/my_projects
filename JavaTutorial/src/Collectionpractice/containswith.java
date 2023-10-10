package Collectionpractice;

public class containswith <t>

{
	 private t[] a = (t[]) new Object[4];

	 private int index =0;
	 
	 void add(t num)
	 {
		 if(index<a.length)
		 {
			 a[index++]=num;
		 }
		 else
		 {
		     int size = (int) (1.5*a.length);
		     t[] b = (t[]) new Object[size];
		     
		     for (int i = 0; i < a.length; i++) {
				
		    	         b[i]=a[i];
			}
		     a=b;
		     a[index++]=num;
			  
		 }
	 }
	 
	 boolean contains(t data)
	 {
		 for (int i = 0; i < a.length; i++) {
			
			 if(a[i]==data)
			 {
				 return true;
			 }
		}
		 return false;
	 }
	 
	 void print ()
	 {
		 for (int i = 0; i <index; i++) {
			
			 System.out.println(a[i]+" ");
		}
	 }
	public static void main(String[] args) {
	
          containswith<Integer> a = new containswith<Integer>();
          
          a.add(10);
          a.add(20);
          a.add(30);
          a.add(40);
          a.add(50);
          a.add(60);
          
          System.out.println(a.contains(20));
		 a.print();
	}

}

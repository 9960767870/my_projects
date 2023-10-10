package Test;

public class Assint7 {

	public static void main(String[] args) 
	{
         int[] a = {1,2,3,4,5,6};
         
//         for (int i = a.length-1; i>=0; i--) {
//			System.out.println(a[i]);
//		}
         
         
         int p = 0;
         int q = a.length-1;
         
         while(p<q)
         {
            int temp = a[p];
            a[p] = a[q];
            a[q] = temp;
            
            p++;
            q--;
         }
        
         for (int i = 0; i < a.length; i++) {
        	 System.out.println(a[i]);
		}
         

	}

}

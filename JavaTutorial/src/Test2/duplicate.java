package Test2;

import java.util.Arrays;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char a[]= {'A','B','C','D','a','b','t','D'};
		char cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					cnt++;
					break;
				}
			}
		}
		char z[]=new char[a.length-cnt];
		System.out.println(cnt);
		int index=0;
		for (int i = 0; i < a.length; i++) {
			int p=0;
			for (int j = 0; j < z.length; j++) {
				if(a[i]==z[j]) {
					p++;
				}
			}
			if(p==0)
			{
				z[index++]=a[i];
			}
		}
		//System.out.println(Arrays.toString(z));
		
		
		char q[]=new char[z.length];
		int index1=0;
		
		//int index3=0;
		for (int i = 0; i < z.length; i++) {
			if(z[i]>='A' && z[i]<='Z')
				{
				   q[index1++]=z[i];
				}
			else
			{
				 q[index1++]=z[i];
			}
				
			
		}
	
		//System.out.println(Arrays.toString(q));
		
		for (int i = 0; i < q.length; i++) {
			if(q[i]>='A' && q[i]<='Z')
			{
				System.out.println("capital letter ");
				System.out.println(q[i]);
			}
			else
			{
				System.out.println("lower");
				System.out.println(q[i]);
			}
		}
		}

}

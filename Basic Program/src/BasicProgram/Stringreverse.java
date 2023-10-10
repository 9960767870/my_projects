package BasicProgram;

import java.util.Arrays;

public class Stringreverse {

	public static void main(String[] args) {
		
		
//		
//		int[] a = {10,3,4,3,2,1,5,6,5,7,8,8,9};
//		
//		int count=0;
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				
//				if(a[i]==a[j])
//				{
//					count++;
//				}
//			}
//		}
//		
//		int[] b = new int[a.length-count];
//		
//		int index=0;
//		
//		for (int i = 0; i < a.length; i++) {
//			int counter=0;
//			for (int j = 0; j < b.length; j++) {
//				if(a[i]==b[j])
//				{
//					counter++;
//				}
//			}
//			if(counter==0)
//			{
//				 b[index++]=a[i];
//			}
//		}
//		
//		
//		for (int i = 0; i < b.length; i++) {
//			for (int j =i+1; j < b.length; j++) {
//				
//				if(b[i]>b[j])
//				{
//					int temp=b[i];
//					b[i]=b[j];
//					b[j]=temp;
//				}
//			}
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i]+" ");
//		}
		
		
//		int[] a = {10,20,10,10,10,20,30,40,10};
//		
//		
//		
//		for (int i = 0; i < a.length; i++) {
//			int count=0;
//			for (int j = 0; j < a.length; j++) {
//				
//				if(a[i]==a[j])
//				{
//					count++;
//				}
//			}
//			if(count>4)
//				System.out.println(a[i]);
//		}
		
		
//		
//		int[][] a = { {1,2,3},
//			       	  {4,5,6},
//			       	  {7,8,9},
//		};
//		
//		int c=0;
//		for (int i = 0; i < a.length; i++) {
//			
//			for (int j = 0; j < a.length; j++) {
//				
//		       System.out.print(a[i][j]+" ");
//			}
//			
//		
//			
//		}
		
		
//		int[] a = {0,2,3,1,0,0,4,5,0,6,0};
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			 if(a[i]!=0)
//			  {
//				  System.out.println(a[i]);
//			  }
//			
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			int c=0;
//			for (int j =0; j < a.length; j++) {
//				
//				if(a[i]==a[j])
//				{
//					c++;
//				}
//			}
//			 if(c>3 && a[a.length-1]<c )
//				{
//		           System.out.println(a[i]);
//				}
//		}
		
		
//		int[] a = {1,2,3,4,5,6,7,8,9};
//		
//		int k=3;
//		
//		int temp=a[k-1];
//		a[k-1]=a[a.length-k];
//		a[a.length-k]=temp;
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
//		for (int i = 2; i <100; i++) {
//			
//			int cnt=0;
//			
//			for (int j =2; j <i; j++) {
//				
//				if(i%j==0)
//					cnt++;
//			}
//			if(cnt==0)
//				System.out.println(i);
//		}
		
		
		String s = "rushi,dasharath ,bhosale";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			
			String e=s1[i];
			char[] ch = e.toCharArray();
			
			int k=0;
			int j=e.length()-1;
			
			while(j>k)
			{
				char temp=ch[k];
				ch[k]=ch[j];
				ch[j]=temp;
				k++;
				j--;
			}
			
			s1[i] = new String(ch);
		
			
		}
		
//		for (int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
//		}
	
		
				
					
		
			
		
		
	
		
		
		}
		
	}

	


	



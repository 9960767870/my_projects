package Array;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,3,5,6,2,3,4,5,97,1,23};
		int count=0;
		for(int i=0;i<a.length;i++)
		{

		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]==a[j])
		{
		  count++;
		  break;
		}
		}
		}
		
		int [] b = new int[a.length-count];
		int index=0;

		for(int i=0;i<a.length;i++)
		{
		int cnt=0;
		for(int j=0;j<b.length;j++)
		{
		if(a[i]==b[j])
		{
		 cnt++;
		break;
		}
		}
		if(cnt==0)
		    b[index++]=a[i];
	}
		
		System.out.println(Arrays.toString(b));
	}
}

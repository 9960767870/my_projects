package Test3;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {8,9,10,12,3,2,7,16,15,11};
		
		for (int i = 0; i < a.length; i++) 
		{
			int temp=a[i];
			int j = i;
			for (; j >0; j--) 
			{
			    if(a[j-1]>temp)
			    {
			    	a[j]=a[j-1];	
			    }
			    else
			    {
			    	break;
			    }
			      
			}
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}

	}

}

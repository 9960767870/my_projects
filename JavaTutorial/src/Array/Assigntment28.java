package Array;

public class Assigntment28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,1,1,1,1,2,2,3,4};
		int[] n = {1,2,4};
		
		for (int i = 0; i < n.length; i++) {
			
			int nNum = n[i];
			
			int count = 0;
			for (int j = 0; j < a.length; j++) 
			{
				
				if(a[j]==nNum)
					count++;
			}
			if(count>2)
				count=2;
			
			int[] newA = new int[a.length-count];
			count = 0;
			int newIndex = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j]==nNum && count<2)
					count++;
				else
					newA[newIndex++]=a[j];
			}
			a =  newA;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}

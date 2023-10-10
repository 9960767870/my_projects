package BasicProgram;

public class Assint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {10,20,10,30,40,50,60,20,30,40};
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
					System.out.println(a[j]);
				}
			}
		}
		System.out.println(count);
 
	}

}

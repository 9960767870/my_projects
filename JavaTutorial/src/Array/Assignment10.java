package Array;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,4,5,6,7,8,9,10};
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
				
			}
		}
			
			int[] EvenArray = new int[count];
			int[] oddArray = new int[a.length-count];
			
			int evenindex = 0;
			int oddindex = 0;
			for (int i1 = 0; i1 < a.length; i1++) {
				if(a[i1]%2==0) {
					EvenArray[evenindex++]=a[i1];
				}
				else {
					oddArray[oddindex++]=a[i1];
				}
		
			
		}
			System.out.println("Even number");
			for (int j = 0; j < EvenArray.length; j++) {
				System.out.println(EvenArray[j]+" ");
			}
			
			System.out.println("Odd number");
			for (int k = 0; k < oddArray.length; k++) {
				System.out.println(oddArray[k]+" ");
			}
		}
	}

	
	



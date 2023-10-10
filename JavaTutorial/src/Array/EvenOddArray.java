package Array;

public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {12,10,9,20,19,22,3,5,88,44,7};
		int evenCount = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
				
			}
		}
		
		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[a.length-evenCount];
		
		int evenIndex = 0;
		int oddIndex = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenArray[evenIndex]=a[i];
				evenIndex++;
			}
			else {
				oddArray[oddIndex] = a[i];
				oddIndex++;
			}
			
		}
		
		System.out.println("Even Array");
		for(int i=0;i<evenArray.length;i++) {
			System.out.println(evenArray[i]);
		
		}
		System.out.println("Odd Array");
		for(int i=0;i<oddArray.length;i++) {
			System.out.println(oddArray[i]);
		}
		

	}

}

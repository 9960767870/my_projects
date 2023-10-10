package Dec3;

public class Assignt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int[] a = {1,2,3,4,5,6,7,8};
		
		int[] b = new int[a.length-count];
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		
		
		int[] evenNum = new int[count];
		int[] oddNum = new int[a.length-count];
		
		int evenindex = 0;
		int oddindex = 0;
		for (int i = 0; i < b.length; i++) {
			if(a[i]%2==0) {
				evenNum[evenindex++]=a[i];
			}
			else {
				oddNum[oddindex++]=a[i];
			}
		}
		System.out.println("Enter the even number");
		for (int i = 0; i < evenNum.length; i++) {
			System.out.print(evenNum[i]+" ");
		}
		System.out.println();
		System.out.println("enter the odd number");
		for (int i = 0; i < oddNum.length; i++) {
			System.out.print(oddNum[i]+" ");
		}
		
		
		

	}

}

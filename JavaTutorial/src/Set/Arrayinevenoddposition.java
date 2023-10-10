package Set;

public class Arrayinevenoddposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		
		
		System.out.println("Enter the even number");
		
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Odd number");

		for(int i=0;i<arr.length;i=i+2) { 
			System.out.print(arr[i]+" ");
		}
	}

}

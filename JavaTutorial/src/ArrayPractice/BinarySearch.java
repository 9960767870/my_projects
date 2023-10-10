package ArrayPractice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40,50,60};	
		int start = 0;
		int end = a.length-1;
		int num = 50;
	while(true) {
			
			int mid = (start+end)/2;
			if(a[mid]==num) {
				System.out.println("Found at index:"+mid);
				break;
			}
			else if(num>a[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			if(end<start) {
				System.out.println("index not found");
				break;
			}
		}
	
	}

}

package HefShineTutorial;

import java.util.Arrays;

public class BinarySearchExample {

	 public static void main(String[] args) throws CloneNotSupportedException
	    {
	        int arr[] = { 10, 20, 15, 3, 35 };
//	        Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] >= arr[j]) {
						int temp = 0;
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
	        for(int i = 0;i<arr.length;i++) {
	        	System.out.println(arr[i]);
	        }
	        
	        
	        
	        int key = 40;
	        int first = 0; // it is a index of array first and last index.
	        int last = arr.length;
	        int mid = (first + last) / 2;
	        boolean found = false;
	        while(first<=last) {
	        	if(arr[mid] ==key) {
	        		System.out.println(arr[mid] +" found");
	        		break;
	        	} else if(key < arr[mid]) {
	        		last = mid-1;
	        		for(int i = 0;i<arr[last];i++) {
	        			if(arr[i] == key) {
	        				System.out.println(arr[i] + " found");
	        				found = true;
	        				break;
	        			}
	        			
	        		}
	        		if(found) {
        				break;
        			}
	        	} else {
	        		first = mid + 1;
	        		for(int i = first;i<arr[last-1];i++) {
	        			if(arr[i] == key) {
	        				System.out.println(arr[i] + " found");
	        				found = true;
	        				break;
	        			} 
	        	}
	        		if(found) {
        				break;
        			} else {
        				System.out.println(key + "  is not found");
        				break;
        			}
	        }
	        
	        }  
	    }
	 }



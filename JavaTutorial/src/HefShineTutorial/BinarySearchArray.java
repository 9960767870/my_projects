package HefShineTutorial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bytearr[] = {10,20,30,40,50};
		char chararr[] = {'r','u','s','h','i'};
		int intarr[] = {12,20,30,40,50};
		double doublearr[] = {12.2,13.3,14.4,15.6};
		float floatarr[] = {12.2f,13.2f,14.4f,15.6f};
		short shortarr[] = {40,30,50,10,20};
		
		Arrays.sort(bytearr);
		Arrays.sort(chararr);
		Arrays.sort(intarr);
		Arrays.sort(doublearr);
		Arrays.sort(floatarr);
		Arrays.sort(shortarr);
		
		
		byte bytekey = 40;
		char charkey = 's';
		int intkey = 50;
		double doublekey = 14.4;
		float floatkey = 13.2f;
		short shorkey = 5;
		
		System.out.println(bytekey +"index at = "+Arrays.binarySearch(bytearr, bytekey));
		System.out.println(charkey +"index at = "+Arrays.binarySearch(chararr, charkey));
		System.out.println(intkey +"index at = "+Arrays.binarySearch(intarr, intkey));
		System.out.println(doublekey +"index at ="+Arrays.binarySearch(doublearr, doublekey));
		System.out.println(floatkey +"index at ="+Arrays.binarySearch(floatarr, floatkey));
		System.out.println(shorkey +"index at ="+Arrays.binarySearch(shortarr, shorkey));
		

	}

}

package Array;

public class ArraySum {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] a = {10,20,30,40,50,60};
//		
//		double sum = 0;
//		int count=0;
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			sum = sum+a[i];
//			count++;
//		}
//		System.out.println(sum/count);
		public static void main(String[] args) 
		{
			String s1="Aabcd";
			char ch='a';
			myCode(s1,ch);
		}
		//EndOfMainMethod

		private static void myCode(String s1,char ch) 
		{
			//WriteCode Here
	   for(int i=0;i<s1.length();i++)
	 {
	     char[] ca = s1. toCharArray();
	     if(ca[i]!=ch)
	    System.out.println(ca[i]);
	}
			
		}
	

	}



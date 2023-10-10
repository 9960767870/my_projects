package RecurtionUsingString;

public class Assihnt15String {

	static String s = "1234";
	static int sum = 0;
	public static void main(String[] args) {
     
         printSum(0);
      System.out.println(sum);
	}
	private static void printSum(int i) {

    if(i<s.length())
    {
    	if(s.charAt(i)>='0' && s.charAt(i)<='9')
    	{
    		sum = sum+s.charAt(i)-48;
    	}
    	printSum(i+1);
    }
		
	}

}

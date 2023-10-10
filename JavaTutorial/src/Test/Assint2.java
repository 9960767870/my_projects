package Test;

import Wrapper_Classes_In_Number_Class.Equals_Method_Example;

public class Assint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "rushi";
		String s1 = "r";
		
		if(s1.length()<=s.length())
		{
			int i=0;
			for(;i<s1.length();i++)
			{
				
				if(s.charAt(i)==s1.charAt(0))
				{
					String subString = s.substring(i, i+s1.length());
					
					if(subString.equals(s1))
					{
						System.out.println(i);
						break;
					}
				}
			}
			if(i==s1.length())
			{
				System.out.println(-1);
			}
			
		}
		

	}

}

package String;

import java.util.Arrays;

public class Assigntment27 {
	public static void main(String[] args) 
	{
		String s1 ="123";
		myCode(s1);
	}
	//EndOfMainMethod

	private static void myCode(String s1) 
	{
		//write code here

int diffcount=0;

for(int i=0;i<s1.length();i++)
{
for(int j=i+1;j<s1.length();j++)
{
  if(s1.charAt(i)>='0' && s1.charAt(j)<='9')
   diffcount++;
   break;
 }
}
if(diffcount>0)
System.out.print("not contains only digit");
else
System.out.print("contains only digits");
	
	}

}

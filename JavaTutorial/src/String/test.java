package String;

public class test {
	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine";
		myCode(s1);
	}
	//EndOfMainMethod

	private static void myCode(String s1) 
	{
		//WriteCode Here
  String[] s2 = s1.split(" ");

for(int i=0;i<s2.length;i++)
{
for(int j=i+1;j<s2.length;j++)
{
if(s2[i].length()>s2[j].length())
{
  String temp=s2[i];
s2[i]=s2[j];
s2[j]=temp;
}
}
}
for(int i=0;i<s2.length;i++)
{
System.out.print(s2[i]+" ");
}
		
	}
}


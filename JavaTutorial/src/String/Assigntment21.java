package String;

public class Assigntment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdabcd";
		String s2 ="";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		}
          
		
		
		

	}



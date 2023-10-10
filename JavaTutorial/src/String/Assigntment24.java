package String;

public class Assigntment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdbfnab";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					
					
					System.out.println(s1.charAt(j));
					System.out.println(count);
					count++;
				}
			}
		}
	}

}

package StringPractice;

public class Lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdabef";
		String s2 = "ab";
		System.out.println(s1.lastIndexOf(s2));
		int index = -1;
		if(s2.length()<=s1.length())
		{
			int i =0;
			for (; i <s1.length()-s2.length(); i++) {
				
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subString = s1.substring(i, i+s2.length());
					
					if(subString.equals(s2)) 
					{
						    index = i;
					}
				}
			}
			System.out.println(index);
		}
		else {
			System.out.println(false);
		}

	}

}

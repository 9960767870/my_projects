package StringHW;

public class StartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "rushi";
		String s2 = "rus";
		System.out.println(s1.startsWith(s2));
		
		if(s2.length()<=s1.length())
		{
			int diffcount = 0;
			for (int i = 0; i < s2.length(); i++) {
				if(s2.charAt(i)!=s1.charAt(i))
				{
					diffcount++;
				}
			}
				if(diffcount>0)
				{
					System.out.println(false);
				}
				else {
					System.out.println(true);
				}
				
		}
		else {
			System.out.println(false);
		}

	}
}


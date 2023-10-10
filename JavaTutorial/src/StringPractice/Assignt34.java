package StringPractice;

public class Assignt34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "very i am good student";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = i+1; j < s1.length; j++) {
				
				if(s1[i].length()>s1[j].length())
				{
					String ss = s1[i];
					s1[i] = s1[j];
					s1[j] = ss;
				}
			}
			
		}
		System.out.println(s1[0]);
		System.out.println(s1[s1.length-1]);
		
	}

}

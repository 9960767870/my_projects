package String;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = ("My Name Is Lakhan");
		
		 String[] s1= s.split(" ");

		 for (int i = s1.length-1;i>=0;i--) {
			System.out.println(s1[i]);
		}
	}

}

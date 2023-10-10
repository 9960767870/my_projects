package String;

public class Assint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdbascnvdv";
		String s2="";
		int count=0;
		for (int i = 0; i <s1.length(); i++) {
			
			for (int j =i+1; j <s1.length(); j++) {
				
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					s2=s2+s1.charAt(i);
					break;
				}
					
			}
		}
		System.out.println(count);
		System.out.println(s2);

	}

}

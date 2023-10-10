package BasicProgram;

public class Assint6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdabcd";
		String unique="";
		
		for (int i = 0; i <s.length(); i++) {
			int cnt=0;
			for (int j =i+1; j <s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j))
					cnt++;
			}
			if(cnt==0)
				unique =unique+s.charAt(i);
		}
		
		System.out.println(unique);
	}

}

package HefShineTutorial;

public class BasicStringPrograme {

//	compareTo is used in three ways 1.less than 2.equal  3.greater than
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s1 = "RUSHIKESH";
		
		String s2 = "RUSHIKESH";
		
		int result = s1.compareTo(s2);
		
		if(result <0) {
			System.out.println(s1 + "less than: "+s2);
		}
		else if(result ==0) {
			System.out.println(s1 + "equal to: "+s2);
		}
		else{
			System.out.println(s1 + "greater than: "+s2);
		}

	}

}

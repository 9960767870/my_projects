package HefShineTutorial;

class Stringprograme {


	static void main() {
		// String to char 
		String s = "rushi";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i); 
			System.out.println(ch);
		}
		
		// char to String
		char ch = 0;
//		System.out.println(ch);
// 
//		String s1 = Character.toString(ch);
//		
//	System.out.println(ch);
//	
	
	String s2 = String.valueOf(ch);
	}
	
	 static void sort() {
		
		 String str[] = {"Ram","Sham","Akash","Bala","Dada",};
		 String temp;
		 
		 for(int i=0;i<str.length;i++) {
			 for(int j=i+1;j<str.length;j++) {
				  
				 if(str[i].compareTo(str[j]) < 0) {
					  
					 temp = str[i];
					 str[i] = str[j];
					 str[j] = temp;
				
				 }
				 System.out.println(str[j]);
			 }
		
			 	
		 }
		
		
	 
}
	 
	 static void vowel() {
		 int vowelcount = 0;
		 int consocount = 0;
		 String str1 = "Welcome";
		 
		 str1 = str1.toLowerCase();
		 
		 for(int i=0;i<str1.length();i++) {
			 char ch = str1.charAt(i);
			 
			 if(ch == 'e'|| ch =='l'|| ch =='c'|| ch =='m'|| ch =='o') {
				 
				vowelcount++;
			 }
			 else {
				
				consocount++;
			 }
		 }
		 System.out.println("Number of vowels:"+vowelcount);
		 System.out.println("Number of conco:"+consocount);
	 }

}



public class BasicStringPrograme2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringprograme.vowel();

	}

}

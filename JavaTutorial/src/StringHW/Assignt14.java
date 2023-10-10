package StringHW;

public class Assignt14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12a36";
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
				
				if(s.charAt(i)>='0' && s.charAt(i)<='9'){
					
				
				}
				
				else {
					count++;
					break;
				}
		}
			
				if(count==0) {
					System.out.println("digitnumber");
				}
				else {
					System.out.println("notdigitnumber");
				}
		}
		}
	


	



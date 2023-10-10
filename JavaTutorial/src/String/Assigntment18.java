package String;

public class Assigntment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbbbcccc";
		String unique = "";
		
		for (int i = 0; i <s.length(); i++) {
			int sameCharCount=0;
			for (int j = 0; j < i; j++) {
				if(s.charAt(j)==s.charAt(i))
				sameCharCount++;
				break;
				
			}
			if(sameCharCount==0) {
				unique = unique+s.charAt(i);
			}
			
			
		}
		
		int[] a = new int[unique.length()];
		int aindex = 0;
		
		for (int i = 0; i < unique.length(); i++) {
			
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				
			
			if(unique.charAt(i)==s.charAt(j)) {
				count++;
			}
			     a[aindex++]=count;
			}
		}
			
			char[] c = unique.toCharArray();
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]<a[j]) {
						
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
						
						char tempchar = c[i];
						c[i] = c[j];
						c[j] = tempchar;
				}
			}
		}
			
			for (int i = 0; i < c.length; i++) {
				
				System.out.println(c[i]+" ");
			}
			System.out.println();
			
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]+" ");
			}
		
		
		
		
	}

}

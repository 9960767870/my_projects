package Test;

public class sumaarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {1,2,3,4};
		int[] ss = {1,2,3,4};
		
		int[] sss = new int[ss.length];
		
		int aindex = 0;
		int bindex = 0;
		for (int i = 0; i <s.length; i++) {
			
			if(i<s.length && i<ss.length)
			{
				sss[i] = s[aindex++]+ss[bindex++];
				
			}
		}
		for (int i = 0; i < sss.length; i++) {
			System.out.print(sss[i]+" ");
		}
		

	}

}

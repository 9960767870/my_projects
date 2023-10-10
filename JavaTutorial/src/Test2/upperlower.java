package Test2;

import java.util.Arrays;

public class upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char p[]= {'A','a','Q','z','a'};
	int cnt=0;
	
		for (int i = 0; i < p.length; i++) {
         for (char j='A'; j < 'Z'; j++) {
			if(p[i]==j)
			{
				cnt++;
				break;
			}
		}			
         
		}
		System.out.println(cnt);
       char b[]=new char[p.length-cnt];
       int index=0;
         for (int i = 0; i < p.length; i++) {
        	 int cnt1=0;
			for (int j = 0; j < b.length; j++) {
				if(p[i]==b[j])
				{
					 cnt1++;
					 break;
				}
			}
			if(cnt1==0)
			{
				b[index++]=p[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}

package String;

public class WithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "you very good student";
		
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			int start=0;
			int end=0;
			if(ch[i]!=' ')
			{
				 start=i;
				 int j = i+1;
				 for (; j < ch.length; j++) 
				{
					     
					     if(ch[i]==' ')
					     {
					    	 end=j-1;
					    	 break;
					     }
					     if(j<ch.length-1)
					     {
					    	 end=j;
					     }
				}
				 
        while(end>start)
        {
        	char c = ch[start];
        	ch[start]=ch[end];
        	ch[end]=c;
        	start++;
        	end--;
        }
        
        i=j;
        }
        
			}
		
		String s2 = new String(ch);
		System.out.println(s2);
		}

	}



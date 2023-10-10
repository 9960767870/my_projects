
public class reversestring1 {

	public static void main(String[] args) {
		
		
        int[] s = {10,20,30,60,50};
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < s.length; i++) 
        {
        	if(s[i]>max)
        	{
        		max=s[i];
        	}
			
		}
        
        for (int i = 0; i < s.length; i++) 
        {
        	if(s[i]!=max && s[i]>max2)
        	{
        		max2=s[i];
        	}
			
		}
        System.out.println(max);
        System.out.println(max2);

	}

}

package Recursion;

public class ArrayA28UsingRecursion {
	
	static int[] n = {1,2,4};
	static int[] c = {1,1,1,1,1,2,2,3,4};

	public static void main(String[] args) {
	
		loopi(0);
		print(0);

	}

	private static void print(int i) {
	 if(i<c.length)
	 {
		 System.out.println(c[i]);
		 print(i+1);
	 }
		
	}

	private static void loopi(int i) {
		
		if(i<n.length)
		{
			int count = 0;
			count = findcount(i,0,count);
			if(count>2)
				count = 2;
			int[] newA = new int[c.length-count];
			count = 0;
			int newIndex = 0;
			addInNewA(i,0,count,newA,newIndex);
			c = newA;
			loopi(i+1);
		}
		
	}

	private static int findcount(int i, int j, int count) {
	
		if(j<c.length)
		{
			if(c[j]==n[i])
				count++;
			return findcount(i, j+1, count);
		}
		else
		return count;
	}

	private static void addInNewA(int i, int j, int count, int[] newA, int newIndex) {
		if(j<c.length)
		{
			if(c[j]==n[i] && count<2)
				count++;
			
			else
				newA[newIndex++] = c[j];
			addInNewA(i,j+1,count,newA,newIndex);
		}
		
	}

}

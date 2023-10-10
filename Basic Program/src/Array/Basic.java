package Array;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int a[]= {10,40,30,20,50};
//		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
		
//		String s = "rushi";
//		String s1="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			s1=s1+s.charAt(i);
//		}
//		System.out.println(s1);
//		for(int i=1;i<=1000;i++)
//		{
//			int cnt=0;
//			for(int j=2;j<i;j++)
//			{
//				if(i%j==0)
//					cnt++;
//			}
//			if(cnt==0)
//				System.out.println(i);
		
		
//		}
		
	int[][] a = { {1,2,3},
	{4,5,6},
	{7,8,9},
	};
	
	int sum=0;
	for (int i = 0; i <3; i++) {
		for (int j = 0; j < 3; j++) {
			
			sum=sum+a[i][j];
		}
		
	}
	System.out.println(sum/5);
	}
	}



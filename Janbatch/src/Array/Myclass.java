package Array;

public class Myclass {

	//StartOfMainMethod
		public static void main(String[] args) 
		{
			int[] a= 
			{
				33,78,90,20,5,50,40
			}
			;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int[] a) 
		{
			//WriteCode Here
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp =a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for(int k=0;k<a.length;k++)
			{
				System.out.println(a[k]);
			}
		}
}

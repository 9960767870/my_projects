package Practice2;

public class assint26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a = {'a','b','c','d'};
		char[] b = {'x','y','z'};
		int index=0;
		char[] c = new char[a.length+b.length];
		
		for (int i = 0; i < c.length; i++) {
		
					if(i<a.length)
					{
						  c[index++]= a[i];
					}
					if(i<b.length)
					{
						       c[index++] =b[i];
					}
				}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
			}
		}
	



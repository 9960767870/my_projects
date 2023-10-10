package Array;

public class Assint11<p> {
	private p[] a = (p[]) new Object[5];
	private int index = 0;

	void add(p num) {
		
		for (int i = 0; i < index; i++) 
		{
			if (a[i] == num) {
				return;
			}
		}
		
		if (index < a.length) {
			a[index++] = num;
			return;
		}
		else 
		{
			int size = (int) (1.5 * a.length);
			p[] b = (p[]) new Object[size];

			for (int i = 0; i < a.length; i++) {
				b[i] = a[i];

			}
			a = b;
			a[index++] = num;
		}
	}

	

	void print() {
		for (int i = 0; i < index; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Assint11<Integer> a = new Assint11<Integer>();

		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);
		a.add(2);

		a.print();
		System.out.println();


	}

}

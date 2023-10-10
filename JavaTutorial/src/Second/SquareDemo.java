package Second;

class Square

{
	public int calculateArea(int length) {
		System.out.println(length*length);
		return length;
		
	}
}

public class SquareDemo {
	
	public static void main(String[] args) {
		
		Square s = new  Square();
		s.calculateArea(10);
	}

}

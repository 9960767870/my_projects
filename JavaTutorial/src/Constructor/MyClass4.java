package Constructor;

 class Rectangle{
	
	 int length;
	 int width;
	 public Rectangle(int length,int width) {
		
		 this.length = length;
		 this.width = width;
	}
	 
	 public void rectangleArea() {
		 
		 int num = length*width;
		 System.out.println("Rectangle of area is:"+num);
	 }
	 
	 public int rectanglePerimeter() {
		 
		 int num2 = 2*(length+width);
		return num2;
		 
	 }
	
}

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10, 10);
		obj.rectangleArea();
		obj.rectanglePerimeter();
		
		Rectangle obj2 = new Rectangle(10, 10);
		int sum = obj2.rectanglePerimeter();
		System.out.println(sum);

	}

}

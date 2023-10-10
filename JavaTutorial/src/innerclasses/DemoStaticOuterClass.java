package innerclasses;

public class DemoStaticOuterClass {
	
	static int num = 50;
	
	static class InnerClass{
		static int num2 = 100;
		
		void show() {
			System.out.println("num:"+num);
			System.out.println("num2:"+num2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 DemoStaticOuterClass.InnerClass in = new DemoStaticOuterClass.InnerClass();
		 in.show();
	}

}

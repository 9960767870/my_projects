package innerclasses;

public class LocalOuterClass {
	
	int numout = 100;
	
	void method() {
		
		
		class LocalInnerClass{
			int numIn = 200;
			void show() {
			System.out.println("numout:"+numout);
			System.out.println("numIn:"+numIn);
		}
		}
		LocalInnerClass in = new LocalInnerClass();
		in.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalOuterClass out = new LocalOuterClass();
		out.method();

	}

}

  package JavaTutorialForBegeningCodeWithHarry;
  
  
  interface DemoAno{
	  void math1(int a , int b);
  }

  public class Lambda_Example{
	
	  public static void main(String[] args) {
		  Main l = new Main();
		  l.obj.math1(12, 56);
	  }
	
  }
  
  class Main{
	  	  
	  DemoAno obj = (a,b) -> {
				System.out.println(a + b);
			};
  }


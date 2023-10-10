package Constructor;

public class ConstructorOverloading 
{
    int add1 ;
    int add2 ;
    
    int age;
    String name;
   
   
	
	public ConstructorOverloading(int add1,int add2) {
	
		this.add1 = add1;
		this.add2 = add2;
		System.out.println(add1+add2);
		
	}
	
	public ConstructorOverloading(int age,String name) {
		
		this.age = age;
		this.name = name;
		
		System.out.println(age+" "+name);	
	}
	
	public static void main(String[] args) {
		
       
        ConstructorOverloading v = new ConstructorOverloading(10, 20);
       
        
        ConstructorOverloading c = new ConstructorOverloading(21, "rushi");
       
	}

}

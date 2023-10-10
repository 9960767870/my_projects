package Spring.com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	         ApplicationContext context  = new ClassPathXmlApplicationContext("Spring/com/constructor/co.xml");
	         
	                       Person p =(Person) context.getBean("person1");
	                       
	                       System.out.println(p);
	                       
	                      
	}

}

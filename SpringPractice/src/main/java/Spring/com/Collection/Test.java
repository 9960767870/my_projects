package Spring.com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring/com/Collection/collection.xml");
		
		   Employee emp1 = (Employee) context.getBean("emp1");
		   
		   System.out.println(emp1.getName());
		   
		   System.out.println(emp1.getNumber());
		   
		   System.out.println(emp1.getAddresses());
		   
		   System.out.println(emp1.getCourses());
		   
		   //System.out.println(emp1.getproperty());

	}

}

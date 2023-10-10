package Spring.com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   ApplicationContext context= new ClassPathXmlApplicationContext("Spring/com/autowiring/autoFile.xml");
		   
		       Employee e = context.getBean("emp1",Employee.class);//cant used with typecast;
		   
		   System.out.println(e);
	}

}

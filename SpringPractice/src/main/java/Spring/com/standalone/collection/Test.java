package Spring.com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		 ApplicationContext context= new ClassPathXmlApplicationContext("Spring/com/standalone/collection/standFile.xml");
		
		 
		     Person p = context.getBean("person1",Person.class);
		     
		     System.out.println(p);
	}
}

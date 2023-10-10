package Spring.com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            AbstractApplicationContext context 	= new ClassPathXmlApplicationContext("Spring/com/lifecycle/cycle.xml");
                 
                    Bike b =(Bike) context.getBean("s1");
                    
                    System.out.println(b);
                    
                    
//                    create the registerShutdownHook to destroy the method
                    context.registerShutdownHook();
                    
                    
	} 

}

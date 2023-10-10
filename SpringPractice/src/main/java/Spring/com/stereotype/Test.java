package Spring.com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext con = new ClassPathXmlApplicationContext("Spring/com/stereotype/stereotypeFile.xml");
		
		        Student s =  con.getBean("student", Student.class);
		       // System.out.println(s);
		        
//		        System.out.println(s.hashCode());
//		        
//		        
//		       Student s1 = con.getBean("student",Student .class);
//		       System.out.println(s1.hashCode());
		        
		       Teacher t = con.getBean("teacher",Teacher.class);
		       System.out.println(t.hashCode());
		       
		       Teacher t1 = con.getBean("teacher",Teacher.class);
		       System.out.println(t1.hashCode());
		   
		       
		       
		       
		       
		        
		        
		        System.out.println();
//		        System.out.println(s.getAddress());
//		        System.out.println(s.getAddress().getClass().getName());

//		        s.setStudentName("rushi");
//		        s.setStudentName("akluj");
//		        System.out.println(s.getStudentName());
//		        System.out.println(s.getCityName());
	}

}

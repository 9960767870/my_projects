package Rushikesh.com.SpringPractice.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Rushikesh.com.SpringPractice.model.Student;
import Spring.com.autowiring.Address;

@Configuration
@ComponentScan(basePackages = "Rushikesh.com.SpringPractice.model")
public class AppConfig {

	@Bean
	public Student getStudent() {
		Student st = new Student();
		st.setCityNamae("lkdjf");
		st.setStudentName("dkjg");
		return st;
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
}

package Spring.com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Student 
{
	@Value("Rushi")
	private String studentName;
	@Value("Akluj")
	private String cityName;
	
//	@Value("#{temp}")
//	private List<String> address;
	
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

//	public List<String> getAddress() {
//		return address;
//	}
//
//	public void setAddress(List<String> address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", cityName=" + cityName +  "]";
	}

	
	

}

package Rushikesh.com.SpringPractice.model;

import org.springframework.stereotype.Component;

//@Component
public class Student
{
	private String studentName;
	private String cityNamae;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCityNamae() {
		return cityNamae;
	}
	public void setCityNamae(String cityNamae) {
		this.cityNamae = cityNamae;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", cityNamae=" + cityNamae + "]";
	}

	public void show() {
		System.out.println(" we are getting student bean");
	}
	
}

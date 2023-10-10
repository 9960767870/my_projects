package HefShineTutorial;

import java.util.List;

class AgeNotFound extends Exception{
	
	public AgeNotFound(String message) {
		// TODO Auto-generated constructor stub
		
		super(message);
	}
}

class method{
	static void m() throws AgeNotFound{
		try {
			
			int age = 12;
			if(age<18) {
				
				throw new AgeNotFound("Age is not valid");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("you handled the exception.");
	}
}

public class DemoException {

	public static void main(String[] args) throws AgeNotFound  {
		// TODO Auto-generated method stub
	Result result = new Result();
	result.setSuccess(true);
	System.out.println(result.getSuccess());
	method.m();

	}

}
class Result {
	private Boolean success;
	private List<String> errors;
	private String successMessage;
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
}

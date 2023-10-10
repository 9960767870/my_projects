package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfound {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fs = null;
		
		fs = new FileInputStream("my life");
		
		boolean k=true;
		try
		{
		
		while(k=fs.read()!=1);
		
		}
		catch (Exception e) { 
		
			System.out.println("handdle the exception");
		}
		
		

	}

}

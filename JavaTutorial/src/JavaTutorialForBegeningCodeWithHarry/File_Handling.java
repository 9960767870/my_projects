   package JavaTutorialForBegeningCodeWithHarry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

 public class File_Handling {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myfile = new File("Rushi08file.txt");
		 try {  
		myfile.createNewFile();
		
		}
		
		catch(IOException e) {
			System.out.println("Unable to this file");
		    e.printStackTrace();
		
		}
		
	   /*
	   
		try {
			FileWriter fileWriter = new FileWriter("Rushi08file.txt");
			System.out.println("This is fist program of file handling");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
          */
	}

}

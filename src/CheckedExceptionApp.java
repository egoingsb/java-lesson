import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp {

	public static void main(String[] args) {
		
		// try-catch-finally statements
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("hello.txt", true);
			try {
				String fileContent = "Hello World";
			    fileWriter.write(fileContent);
			} finally {
				fileWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// try-with-resources statements
		try(FileWriter fileWriter2 = new FileWriter("hello.txt", true)){
			String fileContent = "Hello World";
			fileWriter2.write(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {

	public static void main(String[] args) {
		
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		String absolutePath = directory + File.separator + "Documents" +File.separator + "data" +File.separator + fileName;
		System.out.println(absolutePath);

		try(FileWriter fileWriter = new FileWriter(absolutePath)) {
		    String fileContent = "This is a sample text.";
		    fileWriter.write(fileContent);
		    fileWriter.close();
		} catch (IOException e) {
		    // Cxception handling
		}

	}

}

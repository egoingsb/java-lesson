import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountAddOutputFile {

	public static void main(String[] args) {
		
		// 총액을 입력 받는다. 
		double total = Double.parseDouble(args[0]); // 입력값은 문자열 데이터타입이기 때문에 형변환을 명시적으로 해주어야 합니다. 
		double VATrate = 0.1;
		
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+total*VATrate+"\n";
		output += "이익 : "+total*(1-VATrate)+"\n\n";
		
		System.out.println(output);
		
		String directory = System.getProperty("user.home");
		String fileName = "journal.txt";
		String absolutePath = directory + File.separator + "temp" +File.separator + "data" +File.separator + fileName;
		System.out.println(absolutePath);

		try(FileWriter fileWriter = new FileWriter(absolutePath, true)) {
		    String fileContent = output;
		    fileWriter.write(fileContent);
		    fileWriter.close();
		} catch (IOException e) {
		    // Cxception handling
		}

	}

}

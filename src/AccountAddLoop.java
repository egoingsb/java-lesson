import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountAddLoop {

	public static void main(String[] args) {
		
		double[] profitRate = {0.5, 0.3, 0.2};
		
		// 총액을 입력 받는다. 
		double total = Double.parseDouble(args[0]); // 입력값은 문자열 데이터타입이기 때문에 형변환을 명시적으로 해주어야 합니다. 
		double VATrate;
		
		if(total > 10000) {
			VATrate = 0.1;
		} else {
			VATrate = 0;
		}
		
		double VAT = total*VATrate;
		double income = total - VAT;
		
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+VAT+"\n";
		output += "총이익 : "+income +"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += i+"의 이익 : " + profitRate[i] * income + "\n";
			i++; // i = i + 1과 같습니다. 
		}
		
		output += "\n";
		System.out.println(output);
		
		String directory = System.getProperty("user.home");
		String fileName = "journal.txt";
		String absolutePath = directory + File.separator + "temp" +File.separator + "data" +File.separator + fileName;
		
		try(FileWriter fileWriter = new FileWriter(absolutePath, true)) {
		    String fileContent = output;
		    fileWriter.write(fileContent);
		    fileWriter.close();
		} catch (IOException e) {
		    // Cxception handling
		}

	}

}

public class AccountAddShareClass {

	public static void main(String[] args) {
		
		double[] profitRate = {0.5, 0.3, 0.2};
		double total = Double.parseDouble(args[0]);  
		double VATrate = get_vat_rate(total);
		double VAT = get_vat(total, VATrate);
		double income = get_income(total, VAT);
		String output = makeOutput(profitRate, total, VAT, income);
		Print.screen(output); // AccountAddClass.java 에서 정의된 Print.class 클래스 파일을 이용
		Print.file(output); // AccountAddClass.java 에서 정의된 Print.class 클래스 파일을 이용

	}

	public static double get_vat_rate(double total) {
		double VATrate;
		if(total > 10000) {
			VATrate = 0.1;
		} else {
			VATrate = 0;
		}
		return VATrate;
	}

	

	public static String makeOutput(double[] profitRate, double total, double VAT, double income) {
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
		return output;
	}

	private static double get_income(double total, double VAT) {
		return total - VAT;
	}

	private static double get_vat(double total, double VATrate) {
		return total*VATrate;
	}

}

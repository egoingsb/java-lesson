class Person2 {
	// 생성자를 도입함으로서 객체가 생성될 때 필수적으로 필요한 사항에 대해서 반드시 설정을 하도록 강제할 수 있습니다. 
	Person2(int id, String name, double profitRate){
		this.id = id;
		this.name = name;
		this.profitRate = profitRate;
	}
	public String name;
	public int id;
	public double profitRate;
	public String getInfo() {
		return "id:"+id+", name:"+name+", profit rate:"+profitRate;
	}
}

public class AccountAddConstructor {

	public static void main(String[] args) {
		
		Person2 p1 = new Person2(1, "Michael", 0.5);
		Person2 p2 = new Person2(2, "Calvin", 0.3);
		Person2 p3 = new Person2(3, "Robin", 0.2);
		 
		Person2[] profitRate = {p1, p2, p3};
		double total = Double.parseDouble(args[0]);  
		double VATrate = get_vat_rate(total);
		double VAT = get_vat(total, VATrate);
		double income = get_income(total, VAT);
		String output = makeOutput(profitRate, total, VAT, income);
		Print.screen(output);
		Print.file(output);

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

	

	public static String makeOutput(Person2[] profitRate, double total, double VAT, double income) {
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+VAT+"\n";
		output += "총이익 : "+income +"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += profitRate[i].getInfo()+" => " + profitRate[i].profitRate * income + "\n";
			i++; // i = i + 1과 같습니다. 
		}
		
		output += "\n";
		return output;
	}

	public static double get_income(double total, double VAT) {
		return total - VAT;
	}

	public static double get_vat(double total, double VATrate) {
		return total*VATrate;
	}

}

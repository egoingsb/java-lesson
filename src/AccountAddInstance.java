class Person{
	public String name;
	public int id;
	public double profitRate;
	public String getInfo() {
		return "id:"+id+",name:,profit";
	}
}

public class AccountAddInstance {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.id = 1;
		p1.name = "Michael";
		p1.profitRate = 0.5;
		
		Person p2 = new Person();
		p2.id = 2;
		p2.name = "Calvin";
		p2.profitRate = 0.3;
		
		Person p3 = new Person();
		p3.id = 3;
		p3.name = "Robin";
		p3.profitRate = 0.2;
		
		Person[] profitRate = {p1, p2, p3};
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

	

	public static String makeOutput(Person[] profitRate, double total, double VAT, double income) {
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+VAT+"\n";
		output += "총이익 : "+income +"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += profitRate[i].getInfo()+"의 이익 : " + profitRate[i].profitRate * income + "\n";
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

class Person{
	public String name;
	public int id;
	public double profitRate;
	public String getInfo() {
		return "id:"+id+",name:,profit";
	}
}
class Accounting{
	public double total;
	public Person[] profitRate;
	
	public double get_vat_rate() {
		double VATrate;
		if(total > 10000) {
			VATrate = 0.1;
		} else {
			VATrate = 0;
		}
		return VATrate;
	}

	

	public String makeOutput() {
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+get_vat()+"\n";
		output += "총이익 : "+get_income() +"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += profitRate[i].getInfo()+"의 이익 : " + profitRate[i].profitRate * get_income() + "\n";
			i++; // i = i + 1과 같습니다. 
		}
		
		output += "\n";
		return output;
	}

	public double get_income() {
		return total - get_vat();
	}

	public double get_vat() {
		return total*get_vat_rate();
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
		Accounting acc = new Accounting();
		acc.total = Double.parseDouble(args[0]);
		acc.profitRate = profitRate;
		String output = acc.makeOutput();
		Print.screen(output);
		Print.file(output);
	}

	

}

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

class Accounting2{
	public double total;
	public Person2[] profitRate;
	Accounting2(double total, Person2[] profitRate){
		this.total = total;
		this.profitRate = profitRate;
	}
	
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

public class AccountAddConstructor {

	public static void main(String[] args) {
		
		Person2 p1 = new Person2(1, "Michael", 0.5);
		Person2 p2 = new Person2(2, "Calvin", 0.3);
		Person2 p3 = new Person2(3, "Robin", 0.2);
		Person2[] profitRate = {p1, p2, p3};
		Accounting2 acc = new Accounting2(Double.parseDouble(args[0]), profitRate);
		String output = acc.makeOutput();
		Print.screen(output);
		Print.file(output);
	}

	

}
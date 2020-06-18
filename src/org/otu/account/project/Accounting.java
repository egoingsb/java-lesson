package org.otu.account.project;

class Accounting{
	public double total;
	public Person[] profitRate;
	Accounting(double total, Person[] profitRate){
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
			output += profitRate[i].name+"의 이익 : " + profitRate[i].profitRate * get_income() + "\n";
			i++;
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
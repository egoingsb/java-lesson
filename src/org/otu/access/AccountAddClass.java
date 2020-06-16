package org.otu.access;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



class Print{
	public static void file(String output) {
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

	public static void screen(String output) {
		System.out.println(output);
	}
}

class Person{
	public String name;
	public int id;
	public double profitRate;
	Person(int id, String name, double profitRate){
		this.id = id;
		this.name = name;
		this.profitRate = profitRate;
	}
	public String getInfo() {
		return "id:"+id+",name:,profit";
	}
}

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
	public double get_income() {
		return total - get_vat();
	}

	public double get_vat() {
		return total*get_vat_rate();
	}
	public String makeOutput() {
		String output = "";
		output += "매출 : "+total+"\n";
		output += "부가가치세 : "+get_vat()+"\n";
		output += "총이익 : "+get_income()+"\n";
		
		int i=0;
		while(i<profitRate.length) {
			output += i+"의 이익 : " + profitRate[i].profitRate * get_income()+ "\n";
			i++; // i = i + 1과 같습니다. 
		}
		
		output += "\n";
		return output;
	}
}

public class AccountAddClass {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Michael", 0.5);
		Person p2 = new Person(2, "Calvin", 0.3);
		Person p3 = new Person(3, "Robin", 0.2);
		
		Person[] profitRate = {p1, p2, p3};
		Accounting acc = new Accounting(Double.parseDouble(args[0]), profitRate);
		double VATrate = acc.get_vat_rate();
		double VAT = acc.get_vat();
		double income = acc.get_income();
		String output = acc.makeOutput();
		Print.screen(output);
		Print.file(output);

	}

	

	

	



}

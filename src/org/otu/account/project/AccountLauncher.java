package org.otu.account.project;

import java.io.File;

class Person {
	Person(int id, String name, double profitRate){
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

public class AccountLauncher {

	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Michael", 0.5);
		Person p2 = new Person(2, "Calvin", 0.3);
		Person p3 = new Person(3, "Robin", 0.2);
		Person[] profitRate = {p1, p2, p3};
		Accounting acc = new Accounting(Double.parseDouble(args[0]), profitRate);
		String output = acc.makeOutput();
		Print.screen(output);
		Print.file(output);
	}

	

}
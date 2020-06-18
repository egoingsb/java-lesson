package org.otu.access.here;

class Person{
	public String name;
	public int age;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person target = (Person)obj;
		return this.name.equals(target.name) && this.age == target.age;
	}
}

public class EqualApp {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "egoing";
		p1.age = 10;
		
		Person p2 = new Person();
		p2.name = "egoing";
		p2.age = 10;
		
		System.out.println(p1 == p2);  // false
		System.out.println(p1.equals(p2)); 
		
		
	}

}

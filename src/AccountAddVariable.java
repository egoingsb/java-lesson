
public class AccountAddVariable {

	public static void main(String[] args) {
		
		double total = 1000.0;
		double VATrate = 0.1;
		
		System.out.println("매출");
		System.out.println(total);
		System.out.println("부가가치세");
		System.out.println(total*VATrate); 
		System.out.println("이익");
		System.out.println(total*(1-VATrate));

	}

}

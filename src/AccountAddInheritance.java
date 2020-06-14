// AccountAddConstructor 의 내용을 수정하면 안되는 상황에서 동작방법을 수정하고 싶은 경우에 상속을 이용했습니다. 

public class AccountAddInheritance extends AccountAddConstructor{
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
		System.out.println("작업이 성공적으로 끝났습니다.");
	}
}

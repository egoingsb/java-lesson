
public class AccountAddInputOutput {

	public static void main(String[] args) {
		
		// 총액을 입력 받는다. 
		double total = Double.parseDouble(args[0]); // 입력값은 문자열 데이터타입이기 때문에 형변환을 명시적으로 해주어야 합니다. 
		double VATrate = 0.1;
		
		System.out.println("매출");
		System.out.println(total);
		System.out.println("부가가치세");
		System.out.println(total*VATrate); 
		System.out.println("이익");
		System.out.println(total*(1-VATrate));

	}

}

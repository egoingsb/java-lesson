
public class MethodInputOutput {

	// 3. 이렇게 만들어주면 됩니다. 
	public static double get_vat(double money) {
		return money * 0.1;
	}
	
	// 5. 아래와 같이 복수개의 입력 값을 받을 수 있는 메소드를 만들 수 있습니다. 
	// java는 호출되는 형태를 보고 그 형태에 맞는 메소드를 사용합니다. 이것을 over loading이라고 합니다. 
	public static double get_vat(double money, double VATrate) {
		return money * VATrate;
	}
	
	public static void main(String[] args) {
	
		// 1. Math.floor이라는 메소드는 1.1이라는 값을 입력 받아서 이를 처리한 후에 1.0이라는 값을 출력하고 있습니다. 
		System.out.println(java.lang.Math.floor(1.1));
		
		// 2. 우리는 부가세를 계산해주는 메소드를 만들어봅시다. 이런 모습이면 좋겠군요. 
		System.out.println(get_vat(100000.0)); // 10000.0
		
		
		// 4. 부가세율도 지정하고 싶을수도 있겠죠. 이런 모습이면 좋겠군요. 
		System.out.println(get_vat(10000.0, 0.12)); // 1200.0
	}

}

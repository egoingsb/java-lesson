
public class Variable {

	public static void main(String[] args) {
		
		int a = 1; // a : 1
		a = 2; // a : 2 => a의 값은 우항의 값에 따라서 달라집니다. 그래서 변수라고 합니다. 
		
		double b = 1.1; // int는 정수, double은 실수입니다. 
		
		b = 1; // b : 1.0 => 정보의 손실이 없기 때문에 자동으로 1이 1.0으로 변환된 후에 b의 값으로 활당됩니다. 
		// a = 1.1; // => 오류가 발생합니다. 손실이 발생하기 때문입니다. 
		a = (int)1.1; // a : 1 => 명시적으로 1.1을 정수를 변환했기 때문에 오류가 발생하지 않습니다. 
		
		String c = "egoing"; // c : 문자열 데이터 타입만을 허용합니다. 
	}

}

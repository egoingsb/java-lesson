class Calculator5 {
	public double left;
	public double right;
	public double sum() {
		return left + right;
	}
	public double minus() {
		return left - right;
	}
}

class Calculator6 {
	public double left;
	public double right;
	Calculator6(double left, double right){
		this.left = left;
		this.right = right;
		System.out.println("계산기를 left:"+left+", right:"+right+"로 초기화해서 생성했습니다.");
	}
	public double sum() {
		return left + right;
	}
	public double minus() {
		return left - right;
	}
}

public class ConstructorApp {

	public static void main(String[] args) {
		
//		Calculator5를 아래와 같이 사용하면 재대로 동작하지 않을 것 입니다. 
//		이 클래스를 제대로 이용하기 위해서는 left, right의 값을 꼭 입력해줘야 합니다. 
		Calculator5 cal = new Calculator5();
//		cal.left = 2.0; // 이걸 깜빡했습니다. 
//		cal.right = 1.0; // 이걸 깜빡했습니다. 
		System.out.println(cal.sum());
		System.out.println(cal.minus());
		
		
//		인스턴스를 생성할 때 left, right의 값을 반드시 입력하도록 강제할 수 없을까요? 
//		이 때 사용하는 것이 생성자입니다. 
		Calculator6 cal2 = new Calculator6(2.0, 1.0);
		System.out.println(cal2.sum());
		System.out.println(cal2.minus());
		
	}

}

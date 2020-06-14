// 1. Calculator의 기능에 minus를 추가하고 싶을 때 어떻게 해야 할까요? 
// 아래 코드를 직접 수정하면 되지만, 원본일 수정하기는 곤란할 때 상속을 사용합니다.  
class Calculator7 {
	public double sum(double left, double right) {
		return left + right;
	}
}

// 2. 복사해서 추가합니다. 
// 코드의 중복으로 코드의 양이 많아지고, 수정하기가 어려워지고, 가독성이 떨어집니다.  
class Calculator8 {
	public double sum(double left, double right) {
		return left + right;
	}
	public double minus(double left, double right) {
		return left - right;
	}
}

// 3. 상속 기능을 이용합니다. 
// extends 로 인해서 Calculator9 는 Calculator7 의 모든 메소드와 변수를 갖게 되었습니다. 
// 이제부터 Calculator7의 sum을 수정하면 Calculator7를 상속한 모든 클래스의 sum이 동시에 수정되는 폭발적인 효과를 얻을 수 있습니다. 
class Calculator9 extends Calculator7 {
	public double minus(double left, double right) {
		return left - right;
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		Calculator8 cal8 = new Calculator8();
		System.out.println(cal8.minus(2.0, 1.0));
		
		Calculator9 cal9 = new Calculator9();
		System.out.println(cal9.minus(2.0, 1.0));
		
	}

}

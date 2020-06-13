class Calculator2 {
	public static double sum(double left, double right) {
		return left + right;
	}
	public static double minus(double left, double right) {
		return left - right;
	}
}

class Calculator3 {
	public static double left;
	public static double right;
	public static double sum() {
		return left + right;
	}
	public static double minus() {
		return left - right;
	}
}

// static이 없어진 것에 주목하세요. 
class Calculator4 {
	public double left;
	public double right;
	public double sum() {
		return left + right;
	}
	public double minus() {
		return left - right;
	}
}

public class InstanceApp {

	public static void main(String[] args) {
		// 2와 1을 대상으로 계산이 필요한 상황입니다. 이런 작업이 1억개 필요하다고 상상해주세요. 
		System.out.println("STEP1");
		System.out.println(Calculator2.sum(2,1));
		System.out.println(Calculator2.minus(2,1));
		System.out.println(Calculator2.sum(2,1));
		System.out.println(Calculator2.minus(2,1));
		System.out.println(Calculator2.sum(2,1));
		System.out.println(Calculator2.minus(2,1));
		System.out.println(Calculator2.sum(2,1));
		System.out.println(Calculator2.minus(2,1));
		
		// 위의 코드는 이런 문제가 있습니다. 
		// 계산 할 때마다 2,1을 인수로 전달해야 하는 중복이 심하게 발생하고 있습니다. 
		// 코드가 깔끔하지 못합니다.
		// 이렇게 하면 어떨까요? 결과는 같습니다. 하지만 코드가 훨씬 깔끔합니다. 
		System.out.println("STEP2");
		Calculator3.left = 2;
		Calculator3.right = 1;
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		
		// 위의 코드는 이런 문제가 있습니다. 
		// Calculator3 의 상태(left, right)가 계속해서 변화하는 경우 코드는 다시 지저분해집니다. 
		System.out.println("STEP3");
		Calculator3.left = 2;
		Calculator3.right = 1;
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		Calculator3.left = 4; //  ⬅️ 여기서 또 값을 변경해야 합니다.  
		Calculator3.right = 2; //  ⬅️ 여기서 또 값을 변경해야 합니다.
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		Calculator3.left = 2; //⬅️ 여기서 또 값을 변경해야 합니다.  
		Calculator3.right = 1; //⬅️ 여기서 또 값을 변경해야 합니다. 
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		Calculator3.left = 4; //  ⬅️ 여기서 또 값을 변경해야 합니다.  
		Calculator3.right = 2; //  ⬅️ 여기서 또 값을 변경해야 합니다.
		System.out.println(Calculator3.sum());
		System.out.println(Calculator3.minus());
		
		// Calculator3를 복제해서 복제본이 각각 서로 다른 상태를 가지고 있다면 이 문제를 해결할 수 있습니다. 
		System.out.println("STEP4");
		Calculator4 twoOne = new Calculator4(); // 복제해서 twoOne라는 이름을 붙였습니다. 
		twoOne.left = 2; 
		twoOne.right = 1;
		Calculator4 fourTwo = new Calculator4(); // 복제해서 twofourTwo라는 이름을 붙였습니다. 
		fourTwo.left = 2; 
		fourTwo.right = 1;
		System.out.println(twoOne.sum());
		System.out.println(twoOne.minus());
		System.out.println(fourTwo.sum());
		System.out.println(fourTwo.minus());
		System.out.println(twoOne.sum());
		System.out.println(twoOne.minus());
		System.out.println(fourTwo.sum());
		System.out.println(fourTwo.minus());
		
		// 이런 맥락에서 Calculator4 가 오리지널이 되고 twoOne, fourTwo는 오리지널을 분신술로 복제한 아바타들이라고 할 수 있습니다. 오리지널을 class, 아바타들을 instance라고 생각해주세요.  
		
	}

}

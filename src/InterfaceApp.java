// 2. 인터페이스를 만들어봅시다. 이것을 외주업체에게 전달합니다. 
interface Calculable {
	double sum(double left, double right);  // sum 메소드의 형태를 기술합니다. 
}


// 3. 외주업체는 calculable을 만족시키기 위해서 코딩을 합니다. 인터페이스에 적혀있는 형식을 준수하지 않으면 컴파일 자체가 되지 않기 때문에 조작방법에 대한 커뮤니케이션 실패는 일어날 수가 없습니다. 
class Calculator10 implements Calculable {
 	public double sum(double left, double right){return left + right;}
}


/*
4. 여러분은 가짜 클래스를 일단 만들어서 잘 동작할 것이라고 간주하고 작업을 할 수 있습니다. 
class Calculator10 implements calculable {
 	public double sum(double left, double right){return 3.0}
}
*/


public class InterfaceApp {

	public static void main(String[] args) {
		/*
		1. 계산기 클래스가 필요합니다. 
		이 클래스가 만들어질 때까지 기다리자니 시간이 너무 많이 걸립니다. 
		그래서 외주업체에게 작업을 아웃소싱하기로 합니다. 외주 개발자에게 대충 이렇게 이야기합니다.
		Calculator10이라는 이름의 클래스를 만들어주세요. 이 클래스는 sum이라는 메소드가 있어야 합니다. 인수로 전달된 숫자들을 더해주는 기능을 가지고 있어야 합니다. 
		1억을 주고 3달 동안 1억줄 짜리 작업을 하기로 계약을 했습니다. 
		3달후의 상황입니다. 
		
		
		여러분은 이런 클래스를 기대했습니다. 
		class Calculator10{
			public double sum(double left, double right){return left + right;}
		}
		 
		그런데 동료는 이런 클래스를 만들었습니다. 
		class Calculator10{
			public int sum(int val1, int val2, int val3){return val1 + val2 + val3;}
		}
		 
		큰 일 났습니다. ㅠ
		인터페이스 쓸껄
		 
		인터페이스를 써봅시다. 
		 */

		/*
		 5. 외주업체의 클래스 작업이 끝났다면 적용합니다.  
		 */
		Calculator10 cal = new Calculator10();
		System.out.println(cal.sum(2.0, 1.0));
	}

}

// 1. 상속에서 나타나는 다형성을 살펴봅시다. 
// 2. 전화기 클래스를 만들었습니다. 
class Phone {
	public void send(String msg) {
		System.out.println("send => "+msg);
	}

	public void receive() {
		System.out.println("receive");
	}
}
// 3. 전화기를 상속받으면서 게임 기능을 추가하고 싶어졌습니다. 
class GamePhone extends Phone {
	public void up() {
		System.out.println("up");
	}

	public void down() {
		System.out.println("down");
	}

	public void right() {
		System.out.println("right");
	}

	public void left() {
		System.out.println("left");
	}
}
// 4. 게임도 되는 전화기에 웹브라우징 기능까지 탑재해서 스마트폰이라는 이름으로 출시하고 싶습니다. 
// 이 때 phone 클래스의 send 기능은 조금 더 개선하고 싶어졌습니다. 
class SmartPhone2 extends GamePhone{
	// 브라우징 기능 추가
	public void visit(String url) {
		System.out.println(url+"에 방문하셨습니다.");
	}
	public void send(String msg) {
		System.out.println("send => Hello, "+msg);
	}
}

public class PolymorphismInheritanceApp {

	public static void main(String[] args) {
		// 전체 기능을 모두 쓰고 싶다면 이렇게 하면 됩니다. 
		SmartPhone2 s = new SmartPhone2();
		s.send("Hello");
		s.up();
		
		// 전화기능만 쓰고 싶다면 이렇게 하면 됩니다. 
		Phone p = new SmartPhone2();
		p.send("It's me."); // send는 SmartPhone2 에서 override 한 기능이 사용됩니다. 
//		p.up();  // up은 GamePhone 의 기능이기 때문에 작동하지 않습니다. 
	}

}

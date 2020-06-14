// 1. 전화기 인터페이스 정의
interface Phoneable{
	void send(String msg);
	void receive();
}

// 2. 게임기 인터페이스 정의
interface Gamable{
	void up();
	void down();
	void right();
	void left();
}

// 3. 전화기와 게임기의 기능을 모두 가지고 있는 스마트폰 클래스 정의
class SmartPhone implements Phoneable, Gamable{

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

	public void send(String msg) {
		System.out.println("send => "+msg);
	}

	public void receive() {
		System.out.println("receive");
	}
	
}

public class PolymorphismInterfaceApp {

	public static void main(String[] args) {
		// 4. 전체 기능을 모두 쓰고 싶다면 이렇게 하면 됩니다. 
		SmartPhone s = new SmartPhone();
		s.send("Hello");
		s.up();
		
		// 5. 스마트폰을 게임기로서 쓰고 싶다면 이렇게 하면 됩니다. 
		// SmartPhone을 Gamable로서 g라는 이름의 인스턴스를 만들어줘!라고 자바에게 말하는 장면입니다. 
		Gamable g = new SmartPhone();
		g.up(); // 동작합니다. 
		// g.send("Hello"); // 동작하지 않습니다. 
	}
	
	

}

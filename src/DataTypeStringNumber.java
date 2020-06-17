
public class DataTypeStringNumber {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(1.1);
		System.out.println(1+1); // 사칙연산	
		System.out.println(java.lang.Math.floor(1.1)); // 보다 복잡한 연산의 사례
		
		System.out.println("a"); // String
		System.out.println('b'); // Character  
		System.out.println("ab"); // 문제 없습니다. 
		//System.out.println('ab'); // 오류가 발생합니다. => String과 Character는 서로 다른 데이터타입입니다. 혼동하면 안됩니다.
		
		System.out.println("Hello World".length()); // 11
		
		System.out.println("Maximus dui nec adipiscing porttitor java interdum tortor posuere molestie sit pretium natoque facilisi sed egestas, sodales proin mollis fusce mus non torquent elit fermentum velit scelerisque nam integer.".indexOf("java")); // 37 
	}

}

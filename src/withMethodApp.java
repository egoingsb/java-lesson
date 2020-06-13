
public class withMethodApp {
	
	// 첫번째 작업들에 first라는 이름을 붙였습니다. 
	public static void first() {
		System.out.println(1.0);
		System.out.println(1.1);
		System.out.println(1.2);
		System.out.println(1.3);
	}
	
	// 두번째 작업에 second라는 이름을 붙였습니다. 
	public static void second() {
		System.out.println(2.0);
		System.out.println(2.1);
		System.out.println(2.2);
		System.out.println(2.3);		
	}

	public static void main(String[] args) {
				
//		System.out.println(1.0);
//		System.out.println(1.1);
//		System.out.println(1.2);
//		System.out.println(1.3);
//		
//		System.out.println(2.0);
//		System.out.println(2.1);
//		System.out.println(2.2);
//		System.out.println(2.3);
		
//      위의 코드가 아래와 같이 바뀌었습니다. 		
		
		first();
		second();
		
//		--------------------------
		
		System.out.println(1.0);
		System.out.println(2.0);
		System.out.println(1.1);
		System.out.println(2.1);
		System.out.println(1.2);
		System.out.println(2.2);
		System.out.println(1.3);
		System.out.println(2.3);
		
//		위의 코드가 아래와 같이 바뀌었습니다. 코드가 섞이는 것이 불가능합니다.  
		
		first();
		second();
		
//		----------------------------
		
//		1억번 호출해야 한다면 
		
//		System.out.println(2.0);
//		System.out.println(2.1);
//		System.out.println(2.2);
//		System.out.println(2.3);
//		
//		System.out.println(2.0);
//		System.out.println(2.1);
//		System.out.println(2.2);
//		System.out.println(2.3);
//		
//		System.out.println(2.0);
//		System.out.println(2.1);
//		System.out.println(2.2);
//		System.out.println(2.3);
		
//		위의 코드가 아래와 같이 바뀝니다. 
		
		second();
		second();
		second();
		
	}

}

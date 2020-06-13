
public class withoutMethodApp {

	public static void main(String[] args) {
		
		// 서로 연관된 두개의 그룹으로 이루어진 작업들이 있습니다. 
		// 지금은 잘 정돈되어 있습니다. 
		
		System.out.println(1.0);
		System.out.println(1.1);
		System.out.println(1.2);
		System.out.println(1.3);
		
		System.out.println(2.0);
		System.out.println(2.1);
		System.out.println(2.2);
		System.out.println(2.3);
		
		// 여러가지 이유로 작업이 섞이기 시작합니다. 
		// 두번째 작업이 필요없어졌습니다. 섞여버린 코드 속에서 두번재 작업만 제거하는 것이 쉬운 일일까요? 
		
		System.out.println(1.0);
		System.out.println(2.0);
		System.out.println(1.1);
		System.out.println(2.1);
		System.out.println(1.2);
		System.out.println(2.2);
		System.out.println(1.3);
		System.out.println(2.3);
		
		// 두번째 작업을 1억번 호출해야 한다면 얼마나 많은 중복이 발생하나요?  
		// 1억번 사용되는 코드에 버그나 개선 사항이 발생했다면 이를 바로잡기 위해서는 1억개의 코드를 모두 수정해야 할 것입니다. 
		
		System.out.println(2.0);
		System.out.println(2.1);
		System.out.println(2.2);
		System.out.println(2.3);
		
		System.out.println(2.0);
		System.out.println(2.1);
		System.out.println(2.2);
		System.out.println(2.3);
		
		System.out.println(2.0);
		System.out.println(2.1);
		System.out.println(2.2);
		System.out.println(2.3);
		
		// 이런 지옥속에서 우리를 구원해줄 도구가 바로 메소드입니다. 
		// 메소드를 도입한 코드는 withMethodApp.java에 있습니다. 
	}

}

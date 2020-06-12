
public class ArrayApp {

	public static void main(String[] args) {
	
		// 서로 연관된 데이터가 여러개가 있습니다. 아래와 같은 나쁜 일들이 벌어질 수 있습니다. 
		int score1 = 10;
		// 이곳에 1억줄의 코드가 있다고 상상해보세요. 
		// ... 1억
		int score2 = 20;
		// 누군가 기존의 score2 와 다른 취지의 변수를 선언해서 사용한다고 상상해보세요. 
		// score2 = 20230232323;
		int score3 = 30;
		
		
		// 이를 구원해줄 도구가 배열입니다.
		// 두가지 방법으로 만들 수 있습니다. 
		int[] scores1 = {10, 20, 30};
		
		int[] scores2 = new int[3];
		scores2[0] = 10;
		scores2[1] = 20;
		scores2[2] = 30;	
		// 배열은 생성될 때 크기가 결정됩니다. 바꿀 수 없습니다. 
		//scores2[3] = 40; // 에러가 발생합니다.
		
		// 값은 아래와 같은 방법으로 가져옵니다. 
		System.out.println(scores2[0]);
		
		// 아래와 같은 방법으로 배열의 크기를 알아냅니다. 
		System.out.println(scores2.length); // 값의 수가 아니라 생성될 때의 크기입니다. 
		
	}

}

import java.util.ArrayList;

class Person100{
	public void hi() {
		System.out.println("hi");
	}
}

public class ArrayListApp {

	public static void main(String[] args) {
		
		//1. 배열은 매우 좋은 도구입니다만 조금 불편한 점이 있습니다. 사실 불편한 점이 한두가지가 아닙니다. ㅎㅎ
		//그 중에 제일 큰 불편함은 경직성입니다. 아래 코드를 보시죠. 
		//배열을 생성할 때 3개의 값을 담을 수 있는 배열이라는 것을 미리 지정을 합니다. 
		//마치 옷장을 구입할 때 3칸짜리 옷장을 구입하는 것과 똑같은 상황입니다. 
		int[] scores2 = new int[3];
		scores2[0] = 10;
		scores2[1] = 20;
		scores2[2] = 30;
		// 아래와 같이 값을 넣으려고 하면 오류가 발생합니다. 
		//scores2[3] = 30; // java.lang.ArrayIndexOutOfBoundsException 즉 존재하지 않는 칸에 값을 넣으려고 하니 발생하는 에러입니다. 
		
		//2. 이런 경직성을 극복해주는 도구가 ArrayList입니다. 기능도 훨씬 많습니다.
		
		ArrayList score3 = new ArrayList();
		score3.add(10);
		score3.add(20);
		score3.add(30);
		System.out.println(score3.get(0));
		

	}

}

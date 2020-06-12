
public class LoopApp {

	public static void main(String[] args) {
		
		int[] scores = new int[4];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;	
		scores[3] = 40;	
		
		// 전부 출력해봅니다. 
		int i = 0;
		while(i<scores.length) {
			System.out.println(scores[i]);
			i = i + 1;
		}
		
		// 평균을 구해봅시다.
		int sum = 0;
		i = 0;
		while(i<scores.length) {
			sum  = sum + scores[i];
			i = i + 1;
		}
		System.out.println("평균 : "+sum/scores.length);

	}

}

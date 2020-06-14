import org.otu.Math;

public class PackageApp2 {

	public static void main(String[] args) {
		// 둘다 Math라는 이름의 클래스를 사용하고 있지만 패키지의 이름이 다르기 때문에 서로 공존 할 수 있다는 점을 잘 살펴보세요. 
		System.out.println(Math.PI);
		System.out.println(java.lang.Math.PI);
	}

}

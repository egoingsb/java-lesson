import java.util.Date;

public class Comparison {

	public static void main(String[] args) {
		
		// 원시 데이터 타입은 == 로 동등비교를 할 수 있습니다.
		// 원시 데이터 타입의 목록입니다. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		System.out.println(1 > 0); // true
		System.out.println(1 == 0); // false
		System.out.println(1 < 0); // false
		
		int a = 1;
		int b = 1;
		System.out.println(a == b); // true
		
		// 객체라고 하는 형식의 데이터는 복합적인 정보를 담고 있기 때문에 == 로 동등비교를 할 수 없습니다.
		// ==는 데이터가 메모리 상에 존재하는 위치를 의미한다고 생각해주세요. 
		// 그래서 아래 데이터는 같은 날짜를 표현하고 있지만 ==로 비교했을 때 false가 출력됩니다. 
		Date c = new Date(2020, 6, 6);
		Date d = new Date(2020, 6, 6);
		System.out.println(c == d); // false 
		
		// 객체의 경우 동등 비교를 할 때는 equals를 사용하시면 됩니다. 
		System.out.println(c.equals(d)); //true
		
		// 문자열의 경우 원시 데이터 타입이 아니지만 ""를 사용해서 문자열을 만들 경우 == 로 비교가 가능합니다. 
		// 하지만 경우에 따라서 문제가 생길 수 있습니다. equals를 이용하세요. 
		String e = "Hello";
		String f = "Hello";
		System.out.println(e == f); // true
	}

}

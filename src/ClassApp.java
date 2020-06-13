class Calculator {
	public static double PI = 3.14;
	public static double sum(double left, double right) {
		return left + right;
	}
	public static double minus(double left, double right) {
		return left - right;
	}
}

public class ClassApp {

	public static void main(String[] args) {
		System.out.println(Calculator.PI);
		System.out.println(Calculator.sum(2,1));
		System.out.println(Calculator.minus(2,1));
	}

}

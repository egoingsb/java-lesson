import java.io.FileWriter;
import java.io.IOException;


class A{
	A(int index){
		int[] score = {1,2};
		System.out.println(score[index]);
	}
}

class B{
	B(int index){
		try {
			int[] score = {1,2};
			System.out.println(score[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

class C {
	C(int index) throws ArrayIndexOutOfBoundsException{
		int[] score = {1,2};
		System.out.println(score[index]);
	}
}

public class UncheckedExceptionApp {

	public static void main(String[] args) {
		
//		A a = new A(Integer.parseInt(args[0]));
//		B b = new B(Integer.parseInt(args[0]));
//		C c = new C(Integer.parseInt(args[0]));
	    
	}

}

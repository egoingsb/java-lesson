import java.io.FileWriter;
import java.io.IOException;
class A {
	A(){
//		FileWriter fileWriter = new FileWriter("hello.txt", true);
//		String fileContent = "Hello World";
//	    fileWriter.write(fileContent);
//	    fileWriter.close();
	}
}

class B {
	B(){
		try {
			FileWriter fileWriter = new FileWriter("hello.txt", true);
			try {
				String fileContent = "Hello World";
			    fileWriter.write(fileContent);
			} finally {
				fileWriter.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class C {
	C(){
		// try-with-resources statements
		try(FileWriter fileWriter2 = new FileWriter("hello.txt", true)){
			String fileContent = "Hello World";
			fileWriter2.write(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class D {
	D() throws IOException{
		FileWriter fileWriter = new FileWriter("hello.txt", true);
		String fileContent = "Hello World";
	    fileWriter.write(fileContent);
	    fileWriter.close();
	}
}

class E{
	E(int index){
		int[] score = {1,2};
		System.out.println(score[index]);
	}
}

class F{
	F(int index){
		try {
			int[] score = {1,2};
			System.out.println(score[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

class G {
	G(int index) throws ArrayIndexOutOfBoundsException{
		int[] score = {1,2};
		System.out.println(score[index]);
	}
}

public class UncheckedExceptionApp {

	public static void main(String[] args) {
		int index = 2;
		// 1. checked로 분류된 예외의 사례들입니다.
		
		// 2. 예외 처리를 하지 않은 경우 
//		A a = new A();
		
		// 3. close가 필수적으로 필요한 경우에 try catch를 이용해서 예외를 처리하는 방법입니다. 
		
//		B b = new B();
		// 4. close를 자동으로 처리하는 예외처리 방법입니다.
		
//		C c = new C();
		// 5. 예외 처리를 사용하는 쪽으로 위임하는 방법입니다. 사용하는 쪽에서 try로 예외를 처리하거나 throw로 위임해야 합니다. 
//		try {
//			D d = new D();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 6. unchecked에 대한 예외 처리에 대한 사례들입니다. 
		
		// 7. index를 벗어나는 값을 가져오려고 했을 때 발생하는 예외를 보여줍니다. 
//		E e = new E(3);
		
//		F f = new F(3);
//		G g = new G(3);
	    
	}

}

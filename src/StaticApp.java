class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod() {
        System.out.println(classVar); // Ok
//      System.out.println(instanceVar); // Error
    }
    public void instanceMethod() {
        System.out.println(classVar); // Ok
        System.out.println(instanceVar); // Ok
    }
}
public class StaticApp {
 
    public static void main(String[] args) {
//    	 classVar는 static이기 때문에 클래스와 인스턴스 모두에서 접근이 가능합니다. 
        System.out.println(Foo.classVar); // OK
//         instanceVar는 인스턴스의 정보를 저장하는 곳입니다. 따라서 클래스를 통해서는 접근이 불가능합니다. 
//      System.out.println(Foo.instanceVar); // Error
//         위와 같습니다. 
        Foo.classMethod(); // OK
// 		위와 같습니다. 
        
//      Foo.instanceMethod(); // ERROR
         
        Foo f1 = new Foo();
        Foo f2 = new Foo();
//      
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
//      
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1
//      
        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }
 
}
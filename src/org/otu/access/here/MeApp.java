package org.otu.access.here;

// 1. org.otu.access.here와 org.otu.access.there에 DefaultApp.java, PublicApp.java 을 만들어주세요. 
// 각 파일의 접근 제어에 따라서 어떤 제약사항이 있는지 살펴보겠습니다. 

// 8. 같은 패키지의 경우 private을 제외하고 객체 네에서 접근이 가능합니다. 
class InheritanceHere extends PublicApp{
	InheritanceHere(){
		System.out.println(this.publicVal);
		System.out.println(this.defaultVal);
		System.out.println(this.protectedVal);
//		System.out.println(this.privateVal); //fail 
	}
}

// 9. 다른 패키지의 경우 protected는 내부에서 접근이 가능합니다. 
// protected는 사용은 하지 못하지만, 상속등을 통해서 재정의가 가능합니다. 
// 따라서 proteted로 지정된 맴버는 직접 사용하지 말고 상속을 통해서 재정의를 해서 사용하라는 의미이기도 합니다. 
class InheritanceThere extends org.otu.access.there.PublicApp{
	InheritanceThere(){
		System.out.println(this.publicVal);
//		System.out.println(this.defaultVal); //fail
		System.out.println(this.protectedVal);
//		System.out.println(this.privateVal); //fail
	}
}

public class MeApp  {
	
	public String publicVal = "public";
	String defaultVal = "default";
	protected String protectedVal = "protected";
	private String privateVal = "private";
	
	public static void main(String[] args) {
		
		// 2. 자기 자신을 사용하는 것은 모든 경우 엑세스가 됩니다. 
		MeApp me = new MeApp();
		System.out.println(me.publicVal);
		System.out.println(me.defaultVal);
		System.out.println(me.protectedVal);
		System.out.println(me.privateVal);
		
		// 3. 같은 패키지의 경우 private만 엑세스가 안됩니다. 
		PublicApp here_public = new PublicApp();
		System.out.println(here_public.publicVal);
		System.out.println(here_public.defaultVal);
		System.out.println(here_public.protectedVal);
//		System.out.println(here_public.privateVal); // fail
		
		DefaultApp here_default = new DefaultApp();
		System.out.println(here_default.publicVal);
		System.out.println(here_default.defaultVal);
		System.out.println(here_default.protectedVal);
//		System.out.println(here_default.privateVal); // fail
		
		// 4. 다른 패키지의 경우 public class의 public member만 엑세스가 됩니다. 
		org.otu.access.there.PublicApp there_public = new org.otu.access.there.PublicApp();
		System.out.println(there_public.publicVal);
//		System.out.println(there_public.defaultVal); // fail
//		System.out.println(there_public.protectedVal); // fail
//		System.out.println(there_public.privateVal); // fail
		
		// 5. 다른 패키지에 있는 경우 클래스 자체를 인식할 수 없습니다. 
//		org.otu.access.there.DefaultApp there_default = new org.otu.access.there.DefaultApp();
		
		// 6. 같은 패키지의 경우 상속을 받으면 private 만 접근이 안됩니다. 
		InheritanceHere here_inheritance_public = new InheritanceHere();
		System.out.println(here_inheritance_public.publicVal);
		System.out.println(here_inheritance_public.defaultVal);
		System.out.println(here_inheritance_public.protectedVal);
//		System.out.println(here_inheritance_public.privateVal); // fail
		
		// 7. 다른 패키지를 상속 받았어도 public만 제외하고 엑세스가 안됩니다. 
		InheritanceThere there_inheritance_public = new InheritanceThere();
		System.out.println(there_inheritance_public.publicVal);
//		System.out.println(there_inheritance_public.defaultVal); // fail
//		System.out.println(there_inheritance_public.protectedVal); // fail
//		System.out.println(there_inheritance_public.privateVal); // fail
		
	}

}

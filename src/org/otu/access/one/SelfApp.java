package org.otu.access.one;

class SelfAppInheritance extends org.otu.access.two.PublicApp{
	public static void main(String[] args) {
		SelfAppInheritance self = new SelfAppInheritance();
		System.out.println(self.publicVal); // ok
//		System.out.println(self.defaultVal); // fail
		System.out.println(self.protectedVal); // ok
//		System.out.println(self.privateVal); // fail
	}
}

public class SelfApp {
	
	public String publicVal = "public";
	private String privateVal = "private";
	String defaultVal = "default";
	protected String protectedVal = "protected";

	public static void main(String[] args) {
		
		SelfApp self = new SelfApp();
		PublicApp publicIn = new PublicApp();
		DefaultApp defaultIn = new DefaultApp();
		org.otu.access.two.PublicApp publicOut = new org.otu.access.two.PublicApp();
		//default인 경우 다른 패키지에서 접근이 되지 않습니다. 
		//org.otu.excise.two.DefaultApp defaultOut = new org.otu.excise.two.DefaultApp();
		
		System.out.println(self.publicVal); // ok
		System.out.println(self.defaultVal); // ok
		System.out.println(self.protectedVal); // ok
		System.out.println(self.privateVal); // ok
		
		System.out.println(publicIn.publicVal); // ok
		System.out.println(publicIn.defaultVal); // ok
		System.out.println(publicIn.protectedVal); // ok
		// System.out.println(publicIn.privateVal); // fail
		
		System.out.println(defaultIn.publicVal); // ok
		System.out.println(defaultIn.defaultVal); // ok
		System.out.println(defaultIn.protectedVal); // ok
		// System.out.println(defaultIn.privateVal); // fail
		
		System.out.println(publicOut.publicVal); // ok
		//System.out.println(publicOut.defaultVal); // fail
		//System.out.println(publicOut.protectedVal); // fail
		// System.out.println(publicOut.privateVal); // fail
		
	}

}

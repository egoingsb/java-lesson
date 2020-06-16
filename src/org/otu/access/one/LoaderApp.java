package org.otu.access.one;


public class LoaderApp {

	public static void main(String[] args) {
		
		PublicApp publicIn = new PublicApp();
		DefaultApp defaultIn = new DefaultApp();
		org.otu.access.two.PublicApp publicOut = new org.otu.access.two.PublicApp();
		//default인 경우 다른 패키지에서 접근이 되지 않습니다. 
		//org.otu.excise.two.DefaultApp defaultOut = new org.otu.excise.two.DefaultApp();
		
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

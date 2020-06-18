package org.otu.access.here;

class InheritanceHere extends PublicApp{
	InheritanceHere(){
		System.out.println(this.publicVal);
		System.out.println(this.defaultVal);
		System.out.println(this.protectedVal);
//		System.out.println(this.privateVal); //fail 
	}
}
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
		
		MeApp me = new MeApp();
		System.out.println(me.publicVal);
		System.out.println(me.defaultVal);
		System.out.println(me.protectedVal);
		System.out.println(me.privateVal);
		
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
		
		org.otu.access.there.PublicApp there_public = new org.otu.access.there.PublicApp();
		System.out.println(there_public.publicVal);
//		System.out.println(there_public.defaultVal); // fail
//		System.out.println(there_public.protectedVal); // fail
//		System.out.println(there_public.privateVal); // fail
		
//		org.otu.access.there.DefaultApp there_default = new org.otu.access.there.DefaultApp();
		
		InheritanceHere here_inheritance_public = new InheritanceHere();
		System.out.println(here_inheritance_public.publicVal);
		System.out.println(here_inheritance_public.defaultVal);
		System.out.println(here_inheritance_public.protectedVal);
//		System.out.println(here_inheritance_public.privateVal); // fail
		
		InheritanceThere there_inheritance_public = new InheritanceThere();
		System.out.println(there_inheritance_public.publicVal);
//		System.out.println(there_inheritance_public.defaultVal); // fail
//		System.out.println(there_inheritance_public.protectedVal); // fail
//		System.out.println(there_inheritance_public.privateVal); // fail
		
	}

}

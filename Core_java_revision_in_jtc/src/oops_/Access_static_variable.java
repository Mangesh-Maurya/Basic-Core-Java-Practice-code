package oops_;

public class Access_static_variable {

	public static void main(String arg[]){
		System.out.println("---- Accessing Static Variable Using their Class Name----");
		System.out.println("A.a :- "+A25.a);
		System.out.println("---- Accessing Static Variable Using their Class reference variable which is containing null value----");
		A25 a1 = null;
		System.out.println("a1.a :- "+a1.a);
		System.out.println("----Accessing Static Variable Using their Class Object----");
		A25 a2 = new A25();
		System.out.println("a2.a :- "+a2.a);
	}
}
class A25{
	static int a = 10;
}
            
            


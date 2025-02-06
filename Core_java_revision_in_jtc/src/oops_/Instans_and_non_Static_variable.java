package oops_;

public class Instans_and_non_Static_variable {

	public static void main(String arg[]){
		A26 a1 = new A26();
		A26 a2 = new A26();
		A26 a3 = new A26();
	}
}
class A26{
	/* Instance Variable */
	int a = 10;
	/*Static Variable */
	static int b = 20;
	{
		System.out.println("IB-1 in A class");
		System.out.println("a :- "+a);
		System.out.println("b :- "+b);
	}
	{
		System.out.println("IB-2 in A class");
		System.out.println("a :- "+a);
		System.out.println("b :- "+b);
	}
} 


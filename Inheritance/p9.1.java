class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB in Hello");
	}
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("m2 in Hello");
		//System.out.println(a);
		//System.out.println(b);  non static variable connot be referenced from a static context
		System.out.println(c);
	}
}
class Hai extends Hello{
	void showAll(){
		System.out.println("showAll in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		m1();
		m2();
	}
}
class jtc80{
	public static void main(String arg[]){
		Hai hai=new Hai();
		System.out.println(hai.a);
		hai.m1();
		Hello h1=new Hello();
		h1.m1();
		//h1.showAll(); con not access subclass method from super class ref var
	}
}
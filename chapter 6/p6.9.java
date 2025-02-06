class Hello{
	int a=10;
	int b=20;
	static int c=30;
	void m1(){
		System.out.println("m1 in Hello.......instance method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(){
		System.out.println("m2 in Hello.......static method");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}
class jtc60{
	public static void main(String arg[]){
		Hello h1=null;
		h1.m2();
		//h1.m1();
		Hello.m2();
		//Hello.m1();
		Hello h2=new Hello();
		h2.m2();
		h2.m1();
	}
}
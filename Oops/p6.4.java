class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
}
class jtc54{
	int a=10;
	static int b=20;
	Hello h1=new Hello();
	static Hello h2=new Hello();
	public static void main(String ars[]){
		System.out.println("In main method");
		Hello h2=new Hello();
		//System.out.println(a);
		System.out.println(b);
		//System.out.println(h1);
		System.out.println(h2);
		//h1.m1();
		h2.m1();
	}
}
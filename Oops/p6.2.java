class Hello{
	int a=10;
	int b=20;
	static int c=30;
	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void m2(Hello h1){
		System.out.println("M2 in hello");
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(h1.a);
		System.out.println(h1.b);
		System.out.println(h1.c);
	}
}
class jtc52{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.m1();
		h1.m2(h1);// doubt I think here refrence h1 use , defalt value which having a null or string type ka parameter pass kiya h.
	}
}
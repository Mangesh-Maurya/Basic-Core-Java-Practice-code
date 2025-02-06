class hello{
	int a;
	final hello(int a1){
		System.out.println("1 param constructor in hello");
		a=a1;
	}
		void m1(){
			System.out.println("m1 in hello");
			System.out.println(a);
		}
}
class jtc79{
	public static void main(String arg[]){
		hello h1=new hello();
		h1.m1();
		hello h2=new hello(222);
		h2.m1();
	}
}
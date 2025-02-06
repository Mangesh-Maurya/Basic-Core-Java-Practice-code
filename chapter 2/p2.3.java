class Hello{
	int a=10;
	int b;
	int Hello;
	Hello h1;
	void m1(){
		int ab=100;
		int bc;
		int a=101;
		//int b;
		System.out.println("m1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(Hello);
		System.out.println(h1);
		System.out.println(ab);
		//System.out.println(bc);
	}
}
class jtc7{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
class Hai{
}
class Hello extends Hai{
	void m1(Hello h1){
		System.out.println("m1(Hello)in A class");
	}
	void m1(Hai h1){
		System.out.println("m1(Hai)in A class");
	}
	void m1(char c1){
		System.out.println("m1(char)in A class");
	}
}
class JTC_Digital_Liberary{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.m1(null);
		//h1.m1(65);
	}
}
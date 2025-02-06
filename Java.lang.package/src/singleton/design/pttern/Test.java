package singleton.design.pttern;

class Hello { 
	private Hello() {
	}
	private static Hello h1;
	static {
		h1 = new Hello();
	}
	public static Hello getHello() {
		return h1;
	}	
}
public class Test {
	public static void main(String[] args) {
		//Hello h1=new Hello();
		Hello h1=Hello.getHello();
		Hello h2=Hello.getHello();
		System.out.println(h1==h2);
	}
}

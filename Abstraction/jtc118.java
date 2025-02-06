abstract class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB in Hello");
		System.out.println(this);
	}
	Hello(){
		System.out.println("Default Constructor in Hello");
	}
	Hello(int a, int b){
		System.out.println("2 para. constr. in Hello");
		this.a=a;
		this.b=b;
	}
	protected abstract void m1();
	void m2(){
		int a=10;
		int b=20;
		int c=30;
		System.out.println("m2 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this);
	}
	static void m3(){
		System.out.println("use of static method in abstract class");
	}
}
class Hai extends Hello{
	int a;
	int b;
	static int c=60;
	{
		System.out.println("IB in Hai");
		System.out.println(this);
	}
	Hai(){
		System.out.println("Default constr in Hai");
	}
	Hai(int a,int b){
		super(777,666);
		System.out.println("2 para constr in Hai");
		this.a=a;
		this.b=b;
	}
	void show(){
		int a=101;
		int b=202;
		int c=303;
		System.out.println("show in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("Hai class level variable");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println("Hello class level variable");
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
	public void m1(){
		System.out.println("m1 in Hai");
	}
	static void m3(){
		System.out.println("m3 in Hai");
	}
	static void m4(){
		System.out.println("m4 in Hai");
	}
}
public class jtc118{
	public static void main(String[] args){
		Hello h1=null;
		h1=new Hai();
		//h1.show();
		h1.m2();
		System.out.println(h1);
		Hello h2=new Hai(999,888);
		h2.m2();
		Hai hai=new Hai();
		hai.show();
		Hai hai1=new Hai(123,456);
		hai1.show();
		Hello h3=new Hai();
		h3.m3();
		//h3.m4();
	}
}
		
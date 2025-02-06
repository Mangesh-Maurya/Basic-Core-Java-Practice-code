abstract class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB in Hello");
	}
	Hello(){
		System.out.println("Default Constructor in Hello");// doubt without invoke ke hi kyo print ho gya
	}
	Hello(int a, int b){
		System.out.println("2 para. contr. in Hello");
		this.a=a;
		this.b=b;
	}
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	abstract void m2();
	/*private abstract void m3();
	final abstract void m4();   //error: illegal combination of modifiers
	static abstract void m5();*/
}
class Hai extends Hello{
	/*private void m2(){
	    System.out.println("m2 in Hai");  //error: illegal combination of modifiers
	}*/
	public void m2(){
		System.out.println("m2 in Hai");
	}
	//void m3(){    }
	public void m3(){
		System.out.println("m3 in Hai");
	}
	void show(){
		System.out.println("show in Hai");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class jtc116{
	public static void main(String[] arg){
		//Hello h1=new Hello();
		Hello h2=null;
		h2=new Hai();
		h2.m2();
		//h2.m3();
		//h2.show();
		Hai hai=(Hai)h2;
		hai.m3();
		hai.show();
		new Hai().show();
	}
}
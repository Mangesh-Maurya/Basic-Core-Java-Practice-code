abstract class Hello{
	int a=10;
	int b=20;
	static int c=30;
	void m1(){
		System.out.println("m1 in Hello");
	}
	abstract void m2();
	public abstract void m3();
}
abstract class Hai extends Hello{
	void m2(){
		System.out.println("m2 in Hai");
	}
}
class Hai1 extends Hai{
	/*void m3(){
		System.out.println("m3 in Hai1");
	}*/
	public void m3(){
		System.out.println("m3 in Hai1");
	}
}
public class jtc115{
	public static void main(String[] args){
		//Hello h=new Hello();
		Hello h=null;
		h=new Hai1();
		h.m2();
		h.m3();
	}
}
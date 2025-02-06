class Hello{
	final void m1(){
		System.out.println("m1 in Hello");
	}
	static void m2(){
		System.out.println("m2 in Hello");
	}
	void m3(){
		System.out.println("m3 in Hello");
	}
}
class Hai extends Hello{
	/*void m1(){
		System.out.println("m1 in Hai");
	}*/
	/*void m2(){
		System.out.println("m2 in Hai");
	}*/
	/*static void m3(){
		System.out.println("m3 in Hai");
	}*/
	static void m2(){
		System.out.println("m2 in Hai");
	}
	void m3(){
		System.out.println("m4 in Hai");
	}
}
public class jtc110{
	public static void main(String[] args){
		Hai hai= new Hai();
		hai.m1();
		hai.m2();
		hai.m3();
	}
}

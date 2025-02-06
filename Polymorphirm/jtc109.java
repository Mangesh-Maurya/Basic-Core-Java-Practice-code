class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
	void m2(int a){
		System.out.println("m2 in Hello");
	}
	private void m3(){
		System.out.println("m3 in Hello");
	}
	protected int m4(){
		System.out.println("m4 in Hello");
		return 111;
	}
}
class Hai extends Hello{
	void m1(){
		System.out.println("m1 in Hai");
	}
	/*int m2(int a){
		System.out.println("m2(int a) in Hai");
		return 10;
	}*/
	void m2(int a){
		System.out.println("m2(int a) in Hai");
	}
	void m2(int a,int b){
		System.out.println("m2(int a,int b) in Hai");
	}
	public void m3(){
		System.out.println("m3 in Hai");
	}
	/*int m4(){
		System.out.println("m4 in Hai");
		return 101;
	}*/
	public int m4(){
		System.out.println("m4 in Hai");
		return 101;
	}
	private void m5(){
		System.out.println("m5 in Hai");
	}
}
public class jtc109{
	public static void main(String[] args){
		Hai hai=new Hai();
		hai.m1();
		hai.m2(11);
		hai.m2(11,22);
	}
}
	
	
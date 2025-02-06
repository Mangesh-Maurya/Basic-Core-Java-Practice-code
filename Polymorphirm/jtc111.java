class A{
}
class B extends A{
}
class Hello{
	A m1(){
		System.out.println("m1 in Hello");
		return new A();
	}
	B m2(){
		System.out.println("m2 in Hello");
		return new B();
	}
	A m3(A a1){
		System.out.println("m3(A a1) in Hello");
		return a1;
	}
	A m4(B b1){
		System.out.println("m4(B b1) in Hello");
		return b1;
	}
}
class Hai{
	B m1(){
		System.out.println("m1 in Hai");
		return new B();
	}
	A m2(){
		System.out.println("m2 in Hai");
		return new A();
	}
	A m3(B b1){
		System.out.println("m3(B b1) in Hai");
		return b1;
	}
	A m4(A a1){
		System.out.println("m3(A a1) in Hai");
		return a1;
	}
}
public class jtc111{
	public static void main(String[] args){
		Hai hai=new Hai();
		hai.m1();
	}
}
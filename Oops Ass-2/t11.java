class A{
	public void test1(){
		System.out.println("test1");
}}
class B extends A{
	public void test2(){
		System.out.println("test2");
}}
class Test{
	public static void main (String[] arg){
		A a=new A();
		A b=new B();
		B b1=new B();
		((B)b).test2();
		//(B)b.test2();
		//b.test2();
		//a.test2();
	}
}
class A{
	A(){
		System.out.println("No para cons...");
	}
	A(int a){
		System.out.println("1-int para cons...");
	}
	A(short b){
		System.out.println("1-short para cons...");
	}
}
class JTC{
	public static void main(String arg[]){
		A a1=new A((byte)30);
	}
}
class A{
	static int i=B.j;
}
class B extends A{
	static int j=C.methodOne();
}
class C extends B{
	public static int methodone(){
		return D.k;
}}
class D extends C{
	static int k=10;
	public static void main(String arg[]){
		D d = new D();
	}
}
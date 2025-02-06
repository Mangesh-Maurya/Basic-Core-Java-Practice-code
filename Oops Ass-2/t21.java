class A{
	private A(){
		System.out.println("def cons in A class");
	}
}
class B extends A{
	private B(){
		System.out.println("def cons in B class");
	}
	public static void main(String arg[]){
		new B();
	}
}
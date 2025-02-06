class Outer{
	class Inner{
		int a=10;
	}
}
class Test extends Outer.Inner{
	int a=20;
}
class JTC{
	public static void main(String arg[]){
		System.out.println(new Test().a);
	}
}
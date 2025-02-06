class jtc7{
	public static void main(String[] args){
		System.out.println("**MAIN METHOD**");
		TestClasses c1=null;
		System.out.println("--Ref created--\n");
		c1=new TestClasses();
		System.out.println(c1);
		System.out.println(c1.hashCode());
	}
}
class TestClasses{
	static {
		System.out.println("--Static of TestClasses--");
	}
	TestClasses(){
		System.out.println("--TestClasses() Cons--");
	}
}
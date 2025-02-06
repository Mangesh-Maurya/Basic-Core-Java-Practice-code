class hello{
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB in Hello");
	}
	hello(){
		System.out.println("Defalt constructor in Hello");
	}
	hello(hello h){
		System.out.println("1 param constructorin Hello");
	}
	hello(hello h,hello h2){
		System.out.println("2 param constructorin Hello");
	}
}
class jtc81{
	public static void main(String arg[]){
		//hello h1=new hello();
		//hello h2=new hello(null);doubt
		hello h3=new hello(new hello(new hello(new hello(new hello(),new hello()))));//doubt
	}
}
		
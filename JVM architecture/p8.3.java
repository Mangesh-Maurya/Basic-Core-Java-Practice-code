class Hello{
	int a;
	int b;
	 static int c=30;
	{
		System.out.println("IB in Hello");
	}
	
	static {
		System.out.println("SB in Hello");
	}
	Hello(int a,int b,int c){
		//this(5451);
		System.out.println("3 param constructor in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Hello(int age,int b){
		
		this(22,33,44);
		System.out.println("2 param constructor in Hello");
		this.a=a;
		this.b=b;
		
	}
	Hello(int a){
		this(888,777);
		//this(26723);
		
		
		System.out.println("1 param constructor in Hello");
		this.a=a;
	}
	Hello(){
		this(999);
		System.out.println("default constructor in Hello");
	}
	void show(){
		System.out.println("show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class jtc84{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.show();
	}
}
		
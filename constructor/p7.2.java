class Hello{
	int a;
	int b;
	static int c=30;
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB  in Hello");
	}
	Hello (){
		System.out.println("Defalt constructor in Hello");
	}
	//Hello(){}
	
	void Hello(){
		System.out.println("Hello() in Hello");
	}
	Hello(int a1){
		System.out.println("1- param constructor in Hello");
	a=a1;
	}
	Hello(int a1,int b1){
		a=a1;
		b=b1;
	}
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB in Hello");
	}
	void show(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class jtc77{
	public static void main(String arg[]){
		Hello h1= new Hello();
		h1.show();
		h1.Hello();
	}
}
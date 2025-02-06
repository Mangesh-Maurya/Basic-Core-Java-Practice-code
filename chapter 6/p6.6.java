class Hello{
	int a=10;
	int b=20;
	static int c=30;
	{
		System.out.println("IB1 in Hello");
	}
	static{
		System.out.println("SB1 in Hello");
	}
	{
		System.out.println("IB2 in Hello");
	}
	/*Static{
		System.out.println("Sb2 in Hello");
	}*/
}
class jtc56{
	int aa=111;
	static int bb=222;
	{
		System.out.println("IB in jtc56");
		System.out.println(aa);
		System.out.println(bb);
	}
	static{
		System.out.println("SB1 in jtc56");
		//System.out.println(aa);
		System.out.println(bb);
	}
	public static void main(String arg[]){
		System.out.println("In Main");
		System.out.println(Hello.c);
		Hello h1=new Hello();
		Hello h2=new Hello();
		jtc56 j56=new jtc56();
	}
}
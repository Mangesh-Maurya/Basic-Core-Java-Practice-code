class A{
	{
		System.out.println("IB in A class");
		//System.out.println(a);
		System.out.println(b);
	}
	int a=10;
	static int b=20;
	static{
		System.out.println("SB in A class");
		System.out.println(new A().a);
		System.out.println(b);
	}
	public static void main(String arg[]){
		System.out.println("main in A class");
	}
}
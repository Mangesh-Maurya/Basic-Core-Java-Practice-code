class SC2{
	public static void main(String[] args){
		SC2 s=new SC2();
		s.start();
	}
	void start(){
		int a=3;
		int b=4;
		System.out.println(" "+7+2+" ");
		System.out.println(a+b);
		System.out.println(" "+a+b+" ");
		System.out.println(foo()+a+b+" ");
		System.out.println(a+b+foo());
	}
	String foo(){
		return "foo";
	}
}
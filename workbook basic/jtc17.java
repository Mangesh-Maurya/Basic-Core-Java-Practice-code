class jtc17{
	public static void main(String arg[]){
		String str="ABC";
		jtc17 test=new jtc17();
		//System.out.println(obj==test);
		Object obj=str;
		System.out.println(obj==test);
		System.out.println(obj==str);
		obj=test;
		System.out.println("-----");
		System.out.println(obj==test);
		System.out.println(obj==str);
	}
}
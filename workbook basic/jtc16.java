class jtc16{
	public static void main(String arg[]){
		System.out.println(10>78);
		System.out.println(10>=78);
		System.out.println(10>=10);
		System.out.println(10<78);
		System.out.println(10<=78);
		System.out.println(10<=10);
		System.out.println(65==65);
		System.out.println(65==65L);
		System.out.println(65==65.0F);
		System.out.println(65==65.0);
		System.out.println(65=='A');
		//System.out.println(true>=true);
		System.out.println(true==true);
		System.out.println(false==false);
		System.out.println(true==false);
		//System.out.println(1==false);
		String str="1";
		//System.println(1==str);
		String st1="JTC";
		String st2="JTC";
		String st3=new String("JTC");
		System.out.println(st1+"\t"+st2+"\t"+st3);
		System.out.println(st1==st2);
		System.out.println(st1==st3);
	}
}
class Hello{
	String s1;
	String s2="abc";
	String s3="abc123@$";
	String s4="H1 I am in jtc";
	String s5="Hello \t Welcome to jtc";
	String s6="Hello \r NA";
	//String s7=""";//not ok
	//String s8="\u0022";not ok
	String s9="\"";
	String s10=\u0022 Hello String literal\u0022;
	//String s11="\u0022\u0022;
	String s12="C:\\program\\java\\jdk\\bin";
	//String s13= "C:\program\java\jdk\bin";
	String s14="";
	String s15=515+"Hello";
	String s16="\u0001";
	String s17="	";
	String s18="	 ";
	//String s19=""Hello"";
	//String s20=""String"";
	String s22=" ";
	String String;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		//System.out.println(s7);
		//System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		//System.out.println(s11);
		System.out.println(s12);
		//System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);
		System.out.println(s16);
		System.out.println(s17);
		System.out.println(s18);
		//System.out.println(s19);
		//System.out.println(s20);
		System.out.println(s22);
		System.out.println("String:"+String);
	}
}
class jtc14{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
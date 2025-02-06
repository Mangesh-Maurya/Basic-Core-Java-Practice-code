enum MONTH{
	JAN,FEB,MARCH,APR
}
class Hello{
	void m1(char ch){
		System.out.println("char in Switch in m1");
		switch(ch){
			case 'A':
			System.out.println("Case A");
			break;
			case 'B':
			System.out.println("Case B");
			break;
			case 'C':
			System.out.println("Case C");
			break;
			default:
			System.out.println("invalid case in m1");
			case 'D':
			System.out.println("case D");
		}
	}
	void m2(){
		System.out.println("Enum in switch in m2");
		MONTH m[]=MONTH.value();
		for(MONTH m1:m){
			System.out.println(m1+"------"+m1.ordinal());
		}
		MONTH m1=MONTH.FEB;
		switch(m1){
			case JAN:System.out.println("JAN");
			break;
			case FEB:System.out.println("FEB");
			break;
			case JULY:System.out.println("JULY");
		    break;
			default:System.out.println("Invalid Enum Type");
		}
	}
	void m3(String str){
		System.out.println("String from JDK1.7 in m3");
		switch(str){
			case "AB":System.out.println("AB");
			break;
			case "BC":System.out.println("BC");
			break;
			case "CD":System.out.println("CD");
			break;
			default:System.out.println("Invalid String case");
		}
	}
}
class jtc38{
	public static void main(String arg[]){
		Hello h1=new Hello();
		h1.m1('A');
		h1.m2();
		h1.m3(args[0]);
	}
}
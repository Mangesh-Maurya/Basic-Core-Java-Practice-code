class Hello{
	boolean b1;
	boolean b2=true;
	boolean b3=false;
	//boolean b4=TRUE;
	//boolean b5=FALSE;
	//boolean b6=0;
	//boolean b7=1;
	Boolean b8=true;
	Boolean b9=false;
	Boolean b10;
	//Boolean b11=new Boolean();
	Boolean b12=new Boolean(true);
	boolean b13=Boolean.TRUE;
	boolean b14=Boolean.FALSE;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		//System.out.println(b4);
		//System.out.println(b5);
		//System.out.println(b6);
		//System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);
		//System.out.println(b11);
		System.out.println(b12);
		System.out.println(b13);
		System.out.println(b14);
	}
}
class jtc15{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
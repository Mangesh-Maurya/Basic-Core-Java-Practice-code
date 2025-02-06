class Hello{
	Byte b1=10;
	Byte b2=10;
	Short s1=11;
	Short s2=22;
	void m1(){
		System.out.println("m1 in Hello");
		Byte b11=(Byte)(b1+b2);
		byte b12=b1+b2;
		Byte b13=b1+s1;
		byte b14=b1+s1;
		short s11=b1+b2;
		System.out.println(b11);
		System.out.println(b12);
		System.out.println(b13);
		System.out.println(b14);
		System.out.println(s11);
	}
}
class jtc24{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
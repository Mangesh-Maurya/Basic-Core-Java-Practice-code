class Hello{
	final byte b3=10;
	final byte b4=20;
	final byte b5=127;
	final byte b6=10;
	final int i3=10;
	final int i4=20;
	final int i5=2147483647;
	final int i6=1234;
	void m1(){
		byte b14=b3+b4;
		//byte b15=b5+b6;
		byte b16=i3+i4;
		int i14=i3+i4;
		int i15=i5+i4;
		System.out.println("m1 in Hello");
		System.out.println(b14);
		//System.out.println(b15);
		System.out.println(b16);
		System.out.println(i14);
		System.out.println(i15);
	}
}
class note{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
class Hello1{
	int i1=123456980;
	int i2=10100101;
	int i3=2147483647;
	int i4=-2147483648;
	//int i5=2147483648;
	int i6=0101001;
	int i7=012347;
	//int i8=0123478;
	int i9=000;
	int i10=0x123a;
	int i11=0X123A;
	int i12=0XABCF;
	//int i13=123A0X;
	long l1=2147483648l;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		//System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		//System.out.println(i8);
		System.out.println(i9);
		System.out.println(i10);
		System.out.println(i11);
		System.out.println(i12);
		//System.out.println(i13);
		System.out.println(l1);
	}
}
class jtc9{
	public static void main(String[] args){
		Hello1 h1=new Hello1();
		h1.m1();
	}
}
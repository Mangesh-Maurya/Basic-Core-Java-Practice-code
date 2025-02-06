class Hello2{
	int i1=11234;
	int i2=11_234;
	int i3=11__234;
	int i4=11_23_353_3;
	//int i5=_1123;
	//int i6=1123_;
	int i7=0x123_a;
	//int i8=0x_123_A;
	int i9=01_01_01_01_0;
	//int i10=0_X12233A;
	int i11=0_101010;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		//System.out.println(i5);
		//System.out.println(i6);
		System.out.println(i7);
		//System.out.println(i8);
		System.out.println(i9);
		//System.out.println(i10);
		System.out.println(i11);
	}
}
class jtc10{
	public static void main(String[] args){
		Hello2 h1=new Hello2();
		h1.m1();
	}
}
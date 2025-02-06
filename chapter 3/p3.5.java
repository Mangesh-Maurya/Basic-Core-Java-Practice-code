class Hello{
	int i1=10;
	int i2=11;
	int i3=2147483647;
	int i4=Integer.MAX_VALUE;
	int i5=Integer.MIN_VALUE;
	int i6=0b1010101;
	int i7=0x122A;
	float f1=10.22f;
	float f2=Float.POSITIVE_INFINITY;
	//String s1=Float.POSITIVE_INFINITY;
	char ch1='A';
	void m1(){
		System.out.println("m1 in Hello");
		int i11=++i1;//11
		int i12=i2++;//11
		int i13=++i1+i1++;//12+12=24
		int i14=++i1+i1++;//13+13=26
		int i15=i11+--i1;
		//int i16=++i1++;
		//int i17=++i1--;
		//int i18=++10;
		int i19=++i3;
		//int i20=++IntegerMAX_value;
		int i21=++i14;
		int i22=++i5;
		//int i23=i1+++++i2;
		int i24=(i1++)+(++i2);
		int i25=++i6;
		int i26=++i7;
		float f11=++f1;
		float f12=++f2;
		char ch11=++ch1;
		System.out.println(i12);//11
		System.out.println(i13);//24
		System.out.println(i14);//28
		System.out.println(i15);//25
		System.out.println(i19);//-2147483648
		System.out.println(i21);//29
		System.out.println(i24);
		System.out.println(i25);
		System.out.println(i26);
		System.out.println(f11);
		System.out.println(f12);
		System.out.println(ch11);
		System.out.println(f2);
	}
}
class jtc28{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
		
class Hello{
	int i1=1234;
	int i2=1_234;
	int i3=0b10101_10101;
	//int i4=0B_10101011;
	//int i5=0B101010_;
	int i6=0X1238A_B;
	double d1=11.22d;
	double d2=11_22.21;
	//double d3=11._272;
	//double d4=111_.2828;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		//System.out.println(i4);
		//System.out.println(i5);
		System.out.println(i6);
		System.out.println(d1);
		System.out.println(d2);
	   //System.out.println(d3);
		//System.out.println(d4);
	}
}
class jtc17{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
		
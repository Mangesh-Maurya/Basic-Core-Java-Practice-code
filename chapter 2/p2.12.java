class Hello{
	int i1=1010101;
	int i2=0101010;
	int i3=0b101010;
	int i4=0B111000;
	//int i5=0b01010120101;
	//double d1=0b111.01010;
	//double d2=0B101010.1101;
	//byte b1=0b111111010;
	byte b2=0b111010;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		//System.out.println(i5);
		//System.out.println(d1);
		//System.out.println(d2);
		//System.out.println(b1);
		System.out.println(b2);
	}
}
class jtc16{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
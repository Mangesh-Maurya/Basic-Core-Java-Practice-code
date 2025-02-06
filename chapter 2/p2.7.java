class Hai{
	//sfloat f1=11.22;
	float f2=11.22f;
	float f3=11.33F;
	float f4=Float.MAX_VALUE;
	float f5=Float.MIN_VALUE;
	//float f6=11.22;
	float f7=11.22f;
	float f8=99.999f;
	float f9;
	float f10;
	double d1=11.555;
	double d2=526.566D;
	double d3=11.333d;
	double d4=Double.MAX_VALUE;
	double d5=Double.MIN_VALUE;
	double d6=22.22;
	double d7=221.378D;
	double d8=99.99e+5;
	double d9=9.9E-5;
	void show(){
		System.out.println("m1 in Hai");
		//System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		//System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		System.out.println(f9);
		System.out.println(f10);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
	}
}
class jtc11{
	public static void main(String[] args){
		Hai h1=new Hai();
		h1.show();
	}
}
class Hello{
	float f1=Float.POSITIVE_INFINITY;
	float f2=Float.NEGATIVE_INFINITY;
	float f3=Float.NaN;
	float f4=f1+f2;
	float f5=f2+f3;
	char ch1='A';
	char ch2='B';
	int i11=ch1+ch2;
	int ch3=ch1+ch2;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(i11);
		System.out.println(ch3);
	}
}
class jtc19{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
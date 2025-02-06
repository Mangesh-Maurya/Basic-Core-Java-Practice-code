class Hello{
	byte b1=10;
	byte b2=20;
	int i1=10;
	int i2=20;
	long l1=11112;
	long l2=12929;
	void m1(){
		System.out.println("m1 in Hello");
		//byte b11=b1+b2;
		//byte b12=i1+i2;
		//byte b13=b1+i1;
		int i11=b1+b2;
		int i12=i1+i2;
		int i13=b1+i1;
		long l11=l1+l2;
		//System.out.println(b11);
		//System.out.println(b12);
		//System.out.println(b13);
		System.out.println(i11);
		System.out.println(i12);
		System.out.println(i13);
		System.out.println(l11);
	}
}
class jtc18{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
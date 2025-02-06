class Hello{
	int i1=10;
	int i2=11;
	int i3=0b101010;
	int i4=0B101010;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(i1>i2);//false
		System.out.println(i1&i2);//true
		//System.out.println((i1)&&(i2));//true
		//System.out.println(i3&&i4);//false
		System.out.println((i1<i2)&&(i2>i1));//true
		System.out.println((i1<i2)&(i2>i1));//true
	}
}
class jtc26{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
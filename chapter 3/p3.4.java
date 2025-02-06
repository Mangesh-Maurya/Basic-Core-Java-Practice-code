class Hello{
	int i1=10;
	int i2=11;
	void m1(){
		int i11=++i1;
		int i12=--i1;
		int i13=i2++;
		int i14=i2--;
		System.out.println("m1 in Hello");
		System.out.println("i1:"+i1);//10
		System.out.println("i2:"+i2);//11
		System.out.println(i11);//11
		System.out.println(i12);//10
		System.out.println(i13);//11
		System.out.println(i14);//12
	}
}
class jtc27{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
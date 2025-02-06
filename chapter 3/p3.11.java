class Hello{
	byte b1=10;
	int i1=10;
	byte b12=(byte)(char)(double)(float)(byte)i1;
	byte b13=-1;
	char ch1=(char)(byte)(int)(-1);//ch1=1;
	void m1(){
		System.out.println("m1 in Hello");
		//b1=b1+10;
		b1+=10;
		System.out.println(b12);
		System.out.println(ch1);
		System.out.println(b1);
	}
}
class jtc23{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
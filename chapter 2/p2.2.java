class Hello{
	int a;
	int ab;
	int ab1;
	//int 1ab;
	int a1b;
	int a_b;
	int ab_;
	int _ab;
	int a$b;
	//int _;- identifier might not be supported after java SE 8
	int _$;
	//int ab*;
	//int ()_;
	//int for;
	//int true;
	int Integer;
	int INT;
	int For;
	void m1(){
		System.out.println("m1 in Hello");
		System.out.println(Integer);
		System.out.println(INT);
	}
}
class jtc6{
	public static void main(String[] args){
		Hello h1=new Hello();
		h1.m1();
	}
}
	
	
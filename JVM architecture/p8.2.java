class Hai{
	int a;
	int b;
	static int c=30;
	{
		int a=101;
		int b=202;
		int c=303;
		System.out.println("IB in Hai");
		System.out.println(this);
		System.out.println(this.hashCode());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static{
		int a=101;
		int b=202;
		int c=303;
		System.out.println("SB in Hai");
		//System.out.println(this);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Hai(){
		System.out.println("default constructor in Hai");
		System.out.println(this);
		System.out.println(this.hashCode());
	}
	Hai(int a){
		System.out.println("1 param constructor in Hai");
		System.out.println(this);
		System.out.println(this.hashCode());
	    this.a=a;
	}
	Hai(int a,int b){
		System.out.println("2 param constructor in Hai");
		System.out.println(this);
		System.out.println(this.hashCode());
		this.a=a;
		this.b=b;
	}
	void show(){
		int a=100;
		int b=200;
		int c=300;
		System.out.println("Show in Hai");
		System.out.println(this);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	static void show1(){
		int a=999;
		int b=888;
		int c=777;
		System.out.println("Show1 in Hai");
		//System.out.println(this);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(this.a);
		//System.out.println(this.b);
		//System.out.println(this.c);
	}
}
class jtc83{
	public static void main(String arg[]){
		Hai h1=new Hai();
		System.out.println(h1);
		System.out.println(h1.hashCode());
		h1.show();
		System.out.println("***2nd object creation***");
		Hai h2=new Hai(999);
		h2.show();
	    System.out.println(h2);
		System.out.println(h1);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
	}
}
		
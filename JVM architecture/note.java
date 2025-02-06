class HELLO{
	int a;
	 HELLO(){
		 this(10);
		 //this(10,20);
		 System.out.println("1p");
		 //this(10);
	 }
	 HELLO(int a){
		 this();
		 System.out.println("2p");
	 }
	 HELLO(int a,int b)
	 { System.out.println("3p");
	 }
		 
}
class JTC{
	public static void main(String arg[]){
		HELLO h=new HELLO();
	}
}
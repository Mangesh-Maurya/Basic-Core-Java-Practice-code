//For example
/*class A{
	int a;
	int b;
}
class B extends A{}
class extends B{
	System.out.println(super.super.a);
}*/

class Hai{
	int a;
	Hai(int a){
	   System.out.println("1 param contr in Hai");
	   this.a=a;
	}
}
class Hello extends Hai{
}
class jtc84{
	public static void main(String arg[]){
		Hello h1=new Hello();
	}
}//error: constructor Hai in class Hai cannot be applied to given types
//esme error samjh me nhi aa rha hai.
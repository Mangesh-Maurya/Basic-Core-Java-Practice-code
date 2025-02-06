class Hai{
	Hai(){
		super(111);
		System.out.println("default constructor in Hai");
	}
}
class Hello extends Hai{
	Hello(){
		super();
		System.out.println("default constructor in Hello");
	}
}
class jtc85{
	public static void main(String arg[]){
		Hello h1=new Hello();
	}
}// error: constructor Object in class Object cannot be applied to given types;
          
// doubtable of error line I con't understood		  
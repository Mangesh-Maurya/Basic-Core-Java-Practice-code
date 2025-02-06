class Hai{
}
class Hello extends Hai{
}
class jtc107{
	public static void main(String arg[]){
		Hai hai1=new Hai();
		Hello h1=new Hello();
		Hai hai2=new Hello();
		//Hello h2=new Hai();//error: incompatible types: Hai cannot be converted to Hello
		Hello h2=(Hello)new Hai();// error: variable h2 is already defined in method main(String[])
		Hai hai3=hai1;
		Hai hai4=h1;//
		Hai hai5=hai2;
		Hello h3=(Hello)hai1;//not ok
		Hello h4=h1;
		Hello h5=(Hello)hai2;//not ok
	}
}
//Exception in thread "main" java.lang.ClassCastException: Hai cannot be cast to Hello
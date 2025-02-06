class Hello{
}
class Hai extends Hello{
}
class jtc31{
	public static void main(String[] args){
		Hello h1=new Hello();
		Hai hai=new Hai();
		System.out.println(h1 instanceof Hello);
		System.out.println(hai instanceof Hai);
		System.out.println(h1 instanceof Hai);
		System.out.println(hai instanceof Hello);
	}
}
		
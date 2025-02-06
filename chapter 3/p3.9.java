class Hello extends Object{
}
class jtc33{
	public static void main(String[] args){
		Hello h1=null;
		Object o=new Object();
		String s1=new String("JTC");
		Hello h2=new Hello();
		System.out.println(h1 instanceof Hello);
		System.out.println(h2 instanceof Object);
		System.out.println(o instanceof Hello);
		System.out.println(s1 instanceof Object);
		//System.out.println(s1 instanceof Hello);
		System.out.println(o instanceof String);
	}
}
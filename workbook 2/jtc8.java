class jtc8{
	public static void main(String[] args){
		System.out.println("**MAIN METHOD**");
		System.out.println(Xyz.var);
		System.out.println("\n-- Value Accessed--");
		System.out.println(new Xyz());
	}
}
class Xyz{
	static int var=123;
	static{
		System.out.println("--Static of Xyz--");
	}
}
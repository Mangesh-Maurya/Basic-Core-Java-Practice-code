class Foo{
	static void alpha(){
		System.out.println("alpha");
	}
	void beta(){
		System.out.println("beta");
		System.out.println(Foo.alpha());
	}
}
class t6{
	public static void main(String[] args){
		Foo f=new Foo();
		//System.out.println(Foo.alpha());
	}
}
//doubtable
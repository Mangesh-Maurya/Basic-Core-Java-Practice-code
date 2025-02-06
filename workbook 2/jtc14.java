class jtc14{
	public static void main(String[] args) throws Exception{
		System.out.println("In Main Method Loading the Hello Class");
		ClassLoader Loader=Test62.class.getClassLoader();
		Class.forName("Hello",false,loader);
		System.out.println("--Class Loaded Successfully--");
		System.out.println("Delete the .class file and press ENTER");
		System.in.read();
		Hello h=new Hello();
		h.show();
		h.display();
		new Hello(12).show();
		new Hello(89,"JTC").show();
		new Hello().display();
		System.out.println(Hello.value);
	}
}
class Hello{
	int ab;
	String msg;
	static int value=1234;
	Hello(){
		System.out.println("--Hello()Cons--");
	}
	Hello(int ab){
		System.out.println("--Hello(int)Cons--");
	}
	Hello(int ab,String msg){
		System.out.println("--Hello(int,String)Cons--");
	}
	void show(){
		System.out.println("**show()in Hello**");
		System.out.println(ab);
		System.out.println(msg);
	}
	void display(){
		System.out.println("**display() in Hello**");
	}
}
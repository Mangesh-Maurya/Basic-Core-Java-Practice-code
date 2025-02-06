import java.util.ArrayList;
class Hello{
	void m1(){
		System.out.println("m1 in Hello");
	}
}
class Hai{
	void m2(){
		System.out.println("m2 in Hai");
	}
}
class jtc32{
	public static void main(String[] args){
		Hello h1=new Hello();
		Hai hai=new Hai();
		if(h1 instanceof Hello){
			System.out.println("If...");
			h1.m1();
		}
		else if(hai instanceof Hai){
			System.out.println("Else...");
			hai.m2();
		}
		System.out.println("ARRAY LIST");
		ArrayList al=new ArrayList();
		al.add(new Hello());
		al.add(new Hai());
		//al.add(new object());
		al.add(new String("JTC"));
		al.add(99);
		System.out.println(al);
		System.out.println("FOR LOOP...");
		for(Object o:al){
			System.out.println(o);
			if(o instanceof Hello){
				Hello h11=(Hello)o;
				h11.m1();
			}else if(o instanceof Hai){
				Hai hai1=(Hai)o;
				hai1.m2();
			}else if(o instanceof Integer){
				Integer i=(Integer)o;
				System.out.println(i);
			}
		}
	}
}
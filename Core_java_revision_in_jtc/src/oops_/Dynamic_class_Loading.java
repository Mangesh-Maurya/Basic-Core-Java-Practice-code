package oops_;
/*
public class Dynamic_class_Loading {

	static{
		System.out.println("SB in class A");
	}

	private Dynamic_class_Loading(){}
}
class JTC{
	public static void main(String arg[]) throws Exception{
		Class.forName("Dynamic_class_Loading");
	}
}
*/

/*
class A{
	static{
		System.out.println("SB in class A");
	}

	A(){}
}
class JTC1{
	public static void main(String arg[]) throws Exception{
		Class.forName("A");
	}
}
*/


class A{
	static{
		System.out.println("SB in class A");
	}

	private A(){}
}
class JTC{
	public static void main(String arg[]) throws Exception{
		Class.forName("ABC");
	}
}

package java_.language;


public class ClassLevel {
    public static void main(String[] args) {
		Variable vl = new Variable();
		vl.variable_m2();
    }
}

class Variable {
	// class level variables
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bl;
	char c;

	void variable_m2() {
		System.out.println("byte : " + b);
		System.out.println("short : " + s);
		System.out.println("int : " + i);
		System.out.println("long : " + l);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		System.out.println("boolean : " + bl);
		System.out.println("char : " + c);
	}

}
            
package java_.language;


interface Interface{  
   	int a = 10; // public static final int a = 10
   	void m1(); // public abstract void m1() 
default void m2() { 
	System.out.println("m1() in Jtc Interface");
}
 	static void m3(){
		System.out.println("() in Jtc3 Interface");
} 
  }

            
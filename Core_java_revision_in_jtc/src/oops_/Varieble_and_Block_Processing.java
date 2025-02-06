package oops_;

public class Varieble_and_Block_Processing {
	
	    // Static variable initialized to constant value
	    static int staticVar1 = 10;
	    
	    // Static variable initialized to default value
	    static int staticVar2;
	    
	    // Static initialization block
	    static {
	        // Complex initialization logic for static variables
	        staticVar2 = 20;
	    }
	    
	    // Instance variable initialized to constant value
	    int instanceVar1 = 30;
	    
	    // Instance variable initialized to default value
	    int instanceVar2;
	    
	    // Instance initialization block
	    {
	        // Complex initialization logic for instance variables
	        instanceVar2 = 40;
	    }
	    
	    // Constructor
	    public Varieble_and_Block_Processing() {
	        // Additional initialization logic
	    }
	    
	    // Other methods and declarations
	

public static void main(String arg[]) {
	System.out.println("main in Coder");
}
}
// the order of processing during class loading.
/*
1.staticVar1 = 10 (Static Variable)
2.staticVar2 = 20 (Static Initialization Block)
3.instanceVar1 = 30 (Instance Variable)
4.instanceVar2 = 40 (Instance Initialization Block)
5.Constructor
*/
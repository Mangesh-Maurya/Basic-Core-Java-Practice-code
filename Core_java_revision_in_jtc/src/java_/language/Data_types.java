package java_.language;



/* Size of Data Type */

public class Data_types{

   public void dataType2() {
	System.out.println("---dataType2() in Jtc2 class---");
	   byte b11=127;
	   byte b22=-128;
	//byte b33=128; --> 128 is not in the range of byte
	//byte b44=-129;--> -129 is not in the range of byte
	int i11=2147483647;
	int i12=-2147483648;
     //int i13=2147483648; --> 2147483648 is not in the range of int
     //long l14=2147483649; --> by default 2147483649 is int type data and 2147483649 is not in the range 		// of int.
	long l12=2147483648l;
	//float f11=11.11; --> 11.11 is a double type value 11.11f is a float type data. 
	float f12=11.11f;
	double d11=11.12;
	double d12=11.13d;
	System.out.println(b11);
	System.out.println(b22);
	System.out.println(i11);
	System.out.println(i12);
	System.out.println(l12);
	System.out.println(f12);
	System.out.println(d12);
	System.out.println(d12);
	}
	
	public static void main(String[] args) {
		Data_types jtc1=new Data_types();
		jtc1.dataType2();

	}

}

            
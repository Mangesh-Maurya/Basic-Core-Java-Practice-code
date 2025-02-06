class jtc7{
public static void main(String arg[]){
	int ab=87678;
	String bin=Integer.toBinaryString(ab);
	String oct=Integer.toOctalString(ab);
	String hx=Integer.toHexString(ab);
	System.out.println(bin);
	System.out.println(oct);
	System.out.println(hx);
	System.out.printf("\n %d %o %x", ab,ab,ab");//
	System.out.println("\n %d %o %X",ab,ab,ab");
	System.out.println();
	System.out.println(Manth.PI);
}
}
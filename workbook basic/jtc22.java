class jtc22{
	public static void main(String arg[]){
		int ab=56748763;
		int res1=~ab;
		String bin1=Integer.toBinaryString(ab);
		String bin2=Integer.toBinaryString(res1);
		System.out.println(ab);
		System.out.println(bin1);
		System.out.println(res1);
		System.out.println(bin2);
		int bc=-723765342;
		int res2=~bc;
		String bin3=Integer.toBinaryString(bc);
		String bin4=Integer.toBinaryString(res2);
		System.out.println(bc);
		System.out.println(bin3);
		System.out.println(res2);
		System.out.println(bin4);
	}
}
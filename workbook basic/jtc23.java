class jtc23{
	public static void main(String arg[]){
		int ab=7514;//01110101011010;
		int bc=2967;//00101110010111;
		System.out.println(ab);
		System.out.println(bc);
		System.out.println(true & true);
		System.out.println(false & true);
		int res1=ab & bc;
		System.out.println(res1);
		System.out.println(Integer.toBinaryString(res1));
		int m=123;
		boolean b1=m<100 & m++ >10;
		System.out.println(m);
		System.out.println(true|false);
		System.out.println(false|false);
		int res2=ab|bc;
		System.out.println(res2);
		System.out.println(Integer.toBinaryString(res2));
		int n=123;
		boolean b2=n>100|n++ >10;
		System.out.println(n);
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		int res3=ab^bc;
		System.out.println(res3);
		System.out.println(Integer.toBinaryString(res3));
	}
}
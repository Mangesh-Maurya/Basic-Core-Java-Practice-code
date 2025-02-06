class jtc9{
	public static void main(String arg[]){
		byte by1=10+20;
		System.out.println(by1);
		byte by2=10;
		byte by3=20;
		//byte by4=by2+by3;
		int res=by2+by3;
		System.out.println(res);
		final int by5=10;
		final int by6=20;
		byte by7=by5+by6;
		System.out.println(by7);
		char ch1=65;
		char ch2=10;
		//char ch3=ch1+ch2;
		int res2=ch1+ch2;
		System.out.println(res2);
		final char ch4=65;
		final char ch5=10;
		char ch6=ch4+ch5;
		System.out.println(ch6);
		byte b1=10;
		int ab1=b1+12;
		//int ab2=b1+12L;
		long val=b1+12L;
		float f1=10+12.0F;
		//int xy=10+12.0F;
		float f3=Long.MAX_VALUE;
		System.out.println(f3);
		System.out.println(Long.MAX_VALUE);
		//long val2=12L+10.0F;
		float f2=12L+10.0F;
	}
}
class jtc18{
	public static void main(String arg[]){
		System.out.println(20/2==40/4);
		System.out.println(0.0/0.0==0.0/0.0);
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(0.0/0.0!=0.0/0.0);
		System.out.println(Float.NaN!=Float.NaN);
		int ab=10;
		System.out.println("X="+ab=="X="+ab);
		final int xy=10;
		System.out.println("X="+xy=="X="+xy);
	}
}
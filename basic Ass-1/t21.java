class Test{
	public static void leftshift(int i,int j){
		i<<=j;
	}
	public static void main(String arg[]){
		int i=4,j=2;
		leftshift(i,j);
		System.out.println(i);
		System.out.println(j);
	}
}
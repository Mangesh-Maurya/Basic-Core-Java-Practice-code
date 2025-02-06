class A{
	public static void main(String arg[]){
		int ar1[]={27,39,2,-1,7,8,12,6};
	for(int a=ar1.length/2-1; a>=0 ; a--)
		System.out.print(ar1[a]+" ");
        for(int a=ar1.length-1; a>=ar1.length/2;a--)
			System.out.print(ar1[a]+" ");
	}
}
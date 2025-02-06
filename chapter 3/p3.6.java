class jtc29{
	public static void main(String[] args){
		/*int a=10;
		int b=20;
		int c=(a<b)?a:b;
		System.out.println(c);*/
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=(a<b)?a:b;
		System.out.println(c);
		String result=(a<b)?"TRUE":"FALSE";
		System.out.println(result);
		//String result1=(a<b)?a:"FALSE";
		//System.out.println(result1);
		System.out.println("Length of Array:"+args.length);
		for(int i=0;i<args.length;i++){
			System.out.println(args[1]);
		}
	}
}
class jtc20{
	public static void main(String arg[]){
		String st1=new String("JTC");
		String st2=new String("JTC");
		System.out.println(st1+"\t"+st2);
		System.out.println(st1==st2);
		jtc20 t1=new jtc20();
		jtc20 t2=new jtc20();
		System.out.println(t1+"\t"+t2);
		System.out.println(t1==t2);
		int arr[]=new int[12];
		System.out.println(arr);
		System.out.println(st1 instanceof String);
		System.out.println(st1 instanceof String);
		Object ref=st1;
		System.out.println("Ref\t:"+ref);
		System.out.println(ref instanceof String);
		System.out.println(ref instanceof jtc20);
		System.out.println(ref instanceof Object);
		ref=t2;
		System.out.println("Ref\t:"+ref);
		System.out.println(ref instanceof String);
		System.out.println(ref instanceof jtc20);
		System.out.println(ref instanceof Object);
	}
}
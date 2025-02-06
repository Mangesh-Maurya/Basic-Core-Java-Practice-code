class jtc32{
	public static void main(String arg[]){
		int arr[]=null;
		//System.out.println(arr[0]);
		//System.out.println(arr.length);
		//int arr2[12];
		String names[];
		boolean bArr[];
		//arr=new int[];
		//arr=new int[12L];
		//arr=new int[12.0F];
		int size=5;
		arr=new int[size];
		names=new String[3];
		bArr=new boolean[4];
		System.out.println("arr\t:"+arr.length);
		System.out.println("names\t:"+names.length);
		System.out.println("bArr\t:"+bArr.length);
		//arr.length=89;
		int len='A';
		System.out.println("Len\t:"+len);
		String emails[]=new String[len];
		System.out.println("emails\t:"+emails.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(names[0]);
		System.out.println(bArr[0]);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("---------");
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		System.out.println("---------");
		for(int i=0;i<bArr.length;i++){
			System.out.println(bArr[i]);
		}
		System.out.println("---after storing data----");
		arr[0]=123;
		arr[3]=582;
		arr[4]=745;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------");
		names[0]="Som";
		names[1]="Manish Rai";
		names[2]="Jtcindia";
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		double d1Arr[]=new double[2158525];
		System.out.println("Length\t:"+d1Arr.length);
		int arr3[]=new int[0];
		System.out.println("arr3\t:"+arr3.length);
		System.out.println(arr3[0]);
	}
}
		
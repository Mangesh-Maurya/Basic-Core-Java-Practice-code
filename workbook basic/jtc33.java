class jtc33{
	public static void main(String arg[]){
		int arr[]=new int[7];
		System.out.println("Length\t:"+arr.length);
		arr[0]=45;
		arr[3]=28;
		arr[5]=69;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Length\t:"+arr.length);
		//arr.length=9;
		int other[]=arr;
		System.out.println(other==arr);
		arr=new int[9];
		System.out.println(other==arr);
		System.out.println("Length\t:"+arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("------");
		System.out.println("Length\t:"+other.length);
		for(int i=0;i<other.length;i++){
			System.out.println(other[i]);
		}
		System.out.println("\n------");
		final int arr3[]=new int[3];
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		arr3[0]=74;
		arr3[1]=96;
		arr3[2]=25;
		System.out.println("-------");
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		//arr3=new int[4];
		byte b1=90;
		int ab=b1;
		//int arr4[]=new byte[2];//No Inheritance
		int arr5[]=new int[2];
		arr5[0]=b1;
		int ref[]=new int[3];
		Object obj=ref;
		System.out.println(ref==obj);
		System.out.println(ref[0]);
		//System.out.println(obj[0]);
		ref[0]=74;
		//int ref2[]=obj;
		int ref3[]=(int[])obj;
		System.out.println(obj==ref3);
		System.out.println(ref==ref3);
		System.out.println(ref[0]);
		System.out.println(ref3[0]);
	}
}
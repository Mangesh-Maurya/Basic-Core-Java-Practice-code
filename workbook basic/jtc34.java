class jtc34{
	public static void main(String arg[]){
		int arr[]=null;
		arr=new int[4];
		byte by1=45;
		int ar3[]={10,20,51,'A',by1};
		System.out.println("Length\t:"+ar3.length);
		int ar4[]={10,20,51,'A',by1};
		for(int i=0;i<ar3.length;i++){
			System.out.println(ar3[i]);
		}
		int ar5[]={10,20,51,'A',by1,};
		System.out.println("Length\t:"+ar5.length);
		//int ar6[]={10,20,51,'A',by1,,};
		System.out.println("\n-- Anonymous---");
		//ar4=new int[3]{12,34,65,67};
		ar4=new int[]{12,34,65,67};
		System.out.println("Length\t:"+ar4.length);
		for(int i=0;i<ar4.length;i++){
			int ab=ar4[i];
			System.out.println(ab);
		}
		System.out.println("\n-----");
		String names[]={"Som","Prakash","Rai","Manish"};
		for(int i=0;i<names.length;i++){
			String ab=names[i];
			System.out.println(ab);
		}
	}
}
class jtc36{
	public static void main(String arg[]){
		int arr[][]=null;
		arr=new int[2][4];
		System.out.println("Len\t:"+arr.length);
		System.out.println("Len\t:"+arr[0].length);
		System.out.println("Len\t:"+arr[1].length);
		//arr[0]=123;
		arr[0][2]=123;
		System.out.println(arr[0][2]);
		System.out.println("------");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("\t"+arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("*******");
		int ref[][]=new int[3][];
		for(int j=0;j<ref.length;j++){
			System.out.println(ref[j]);
		}
		//ref[0][1]=123;
		ref[0]=new int[4];
		ref[1]=new int[]{10,20,15};
		ref[2]=new int[6];
		System.out.println("-------");
		for(int i=0;i<ref.length;i++){
			for(int j=0;j<ref[i].length;j++){
				System.out.println("\t"+ref[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------");
		int values[][]={{12,67,43},{12},{90,80,70,60}};
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[i].length;j++){
				System.out.println("\t"+values[i][j]);
			}
			System.out.println();
		}
		int others[][]=null;
		others=new int[][]{{12,67,43},{12},{90,80,70,60}};
		System.out.println("------");
		for(int i=0;i<others.length;i++){
			for(int j=0;j<others[i].length;j++){
				System.out.println("\t"+others[i][j]);
			}
			System.out.println();
		}
	}
}
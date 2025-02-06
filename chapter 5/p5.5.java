class jtc49{
	public static void main(String arg[]){
		System.out.println("Dynamic Array");
		int a[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
			System.out.println("\n");
		}
		a[0][0]=101;
		a[0][1]=202;
		a[0][2]=303;
		a[1][0]=404;
		a[1][1]=505;
		a[1][2]=606;
		a[2][0]=707;
		a[2][1]=808;
		a[2][2]=909;
		for(int i=0;i<a.length;i++){
			for( int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
			System.out.println("         ");
		}
		System.out.println("************");
		/*int b[][][]=new int[][][];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<a[i][j].length;k++){
					System.out.println(a[i][j][k]+",");
				}
				System.out.println("\n");
			}
		}*/
		System.out.println("*****Stat ic arry******");
		double d1[][]={{11.11,22.22},{33.33,44.44},{55.55,66.66}};
		for(int i=0;i<d1.length;i++){
			for(int j=0;j<d1[i].length;j++){
				System.out.println(d1[i][j]+",");
			}
			System.out.println("\n");
		}
		System.out.println("*****VAR_ARRAY********");
		int c[][]=new int[3][];
		c[0]=new int[3];
		c[0][0]=11;
		c[0][1]=22;
		c[0][2]=33;
		c[1]=new int[2];
		c[1][0]=44;
		c[1][1]=55;
		c[2]=new int[1];
		c[2][0]=66;
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				System.out.println(c[i][j]);
}}}}
class jtc50{
	public static void main(String arg[]){
		int a[][]=new int[3][2];
		a[0][0]=99;
		a[0][1]=88;
		a[1][0]=77;
		a[1][1]=66;
		a[2][1]=44;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]+"\t"+a[i].hashCode());
			}
		}
		System.out.println("*******\n");
		a[0]=new int[3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]+"\t"+a[i].hashCode());
			}
		}
}}
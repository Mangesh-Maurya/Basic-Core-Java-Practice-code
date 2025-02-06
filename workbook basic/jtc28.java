class jtc28{
	public static void main(String arg[]){
		int ab=0;
		while(ab<=25){
			if(ab%3==0)
				System.out.println(ab);
			ab++;
		}
		System.out.println("------");
		ab=-1;
		while(ab++<=25){
			if(ab%3==0)
				System.out.println(ab);
		}
		System.out.println("------");
		int cd=20;
		while(true){
			System.out.println(cd--);
			if(cd==0)break;
		}
		System.out.println("\n----");
		int bn=0;
		while(bn++<5){
			System.out.println("BN\t"+bn);
		}
		System.out.println("\n----");
		bn=0;
		while(bn++<5){}{
			System.out.println("BN\t:"+bn);
		}
		System.out.println("\n----");
		bn=0;
		while(bn++<5);{
			System.out.println("BN\t:"+bn);
		}
		System.out.println("\n----");
		int res=10;
		while(true){
			System.out.println(res);
			if(res<50)break;
			res--;
		}
		System.out.println("\n----");
		res=10;
		do{
			System.out.println(res);
			res--;
		}while(res>50);
		System.out.println("\n----");
		res=0;
		do{
			System.out.println(res);
			res++;
		}while(res<15);
	}
}
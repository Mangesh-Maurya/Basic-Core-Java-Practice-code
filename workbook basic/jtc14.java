class jtc14{
	public static void main(String arg[]){
		//int bc=10++;
		int ab=10;
		ab++;
		System.out.println(ab);
		//int xy=(ab++)++;
		int m=13;
		m++;
		System.out.println(m);
		int n=13;
		++n;
		System.out.println(n);
		System.out.println("----");
		int y=13;
		int r1=y++;
		System.out.println(r1+"\t"+y);
		System.out.println("----");
		int z=13;
		int r2=++z;
		System.out.println(r2+"\t"+z);
		System.out.println("----");
		int rt=13;
		rt=++rt;
		System.out.println("RT\t:"+rt);
		System.out.println("----");
		int qw=13;
		System.out.println("QW++"+qw++);
		System.out.println("QW\t:"+qw);
		System.out.println("----");
		int np=13;
		int tmp=np++;
		np=tmp;
		System.out.println("NP\t:"+np);
		System.out.println("----");
		int ad=13;
		ad=ad++;
		ad=ad++;
		ad=ad++;
		ad=ad++;
		ad=ad++;
		System.out.println("AD\t:"+ad);
		System.out.println("----");
		int val=12;
		int result=val++ +val++ +val++;
		System.out.println(result);
		System.out.println(val);
	}
}
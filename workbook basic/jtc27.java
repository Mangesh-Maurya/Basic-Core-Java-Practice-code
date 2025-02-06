class jtc27{
	public static void main(String arg[]){
		for(int i=0;i<5;i++){
			System.out.println("Value \t:"+i);
		}
		//System.out.println(i);
		for(int i=0,j=100,ch='A';i<5;i++,j-=5,ch++){
			System.out.println(i+"\t"+j+"\t"+ch);
		}
		//for(int i=0,char ch='A';i<5;i++){}
		int mn=0;
		String st="OK";
		char ch='A';
		float f1=0F;
		for(mn=10,st="JTC",ch='a',f1=12.21F;mn<15;mn++,ch+=2,f1+=10,st+=ch){
			System.out.println(mn+"\t"+ch+"\t"+f1+"\t"+st);
		}
		System.out.println("After Loop");
		System.out.println(mn+"\t"+ch+"\t"+f1+"\t"+st);
		int j=10;
		int k=90;
		for(int i=0;j++<15;k--){
			System.out.println(i+"\t"+j+"\t"+k);
		}
		for(j=0,System.out.println("Begin");j<5;j++,System.out.println("updating")){
		}
		//for(int cd=0,System.out.println("Begin");cd<5;cd++,){}
		for(int rt=0;rt<5;rt++,System.out.println("U")){}
		System.out.println("------");
		for(int rt=0;rt<5;rt++,System.out.println("U"));
		System.out.println("--MAIN COMPLETED--");
	}
}
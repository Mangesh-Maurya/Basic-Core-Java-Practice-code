class jtc30{
	public static void main(String arg[]){
		int ab=90;
		//if(ab==90)continue;
		for(int i=0;i<5;i++,System.out.println("OK")){
			System.out.println(i);
			continue;
		}
		System.out.println("\n-------\n");
		for(int i=0;i<12;i++,System.out.println("OK")){
			System.out.println(i);
			if(i%3==0)continue;
			System.out.println("After Continue");
		}
		System.out.println("\n-------\n");
		int mn=-1;
		while(++mn<=5){
			System.out.println("Value\t:"+mn);
			if(mn==3)continue;
			System.out.println("After Cont..");
		}
		System.out.println("\n-------\n");
		mn=0;
		while(mn<=5){
			System.out.println("Value\t:"+mn);
			if(mn==3)continue;
			mn++;
			System.out.println("After Cont..");
		}
	}
}
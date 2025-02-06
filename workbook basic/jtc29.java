class jtc29{
	public static void main(String arg[]){
		int a=10;
		//if(a==10)break;
		for(int i=0;i<15;i++){
			System.out.println("Value of i\t:"+i);
			if(i==5)
				break;
			System.out.println("After Break in for Loop");
		}
		System.out.println("After Looping Statement");
		System.out.println("\n********");
		for(int i=0;i<10;i++){
			System.out.println("Value\t:"+i);
			if(i==3)break;
			System.out.println("After");
		}
		System.out.println("\n********");
		jtc:
		for(int i=0;i<10;i++){
			System.out.println("Value\t:"+i);
			if(i==3)break jtc;
			System.out.println("After");
		}
		System.out.println("\n***nested**");
		for(int i=0;i<7;i++){
			System.out.println("Before in J");
			for(int j=0;j<5;j++){
				System.out.println(i+"\t"+j);
				if(i==3)break;
				System.out.println("After in J");
			}
			System.out.println("After in i");
		}
		System.out.println("\n___jtcled Break__");
		jtc:
		for(int i=0;i<7;i++){
			System.out.println("Before in J");
			for(int j=0;j<5;j++){
				System.out.println(i+"\t"+j);
				if(i==3)break jtc;
				System.out.println("After in J");
			}
			System.out.println("After in i");
		}
		for(int i=0;i<5;i++){
			System.out.println("i value\t:"+i);
			break;
			//System.out.println("After");
		}
	}
}
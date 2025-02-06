class jtc42{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
		int i=0;
		for(;i<10;){
			System.out.println(i);
			i++;
		}
		/*r(System.out.println(i);System.out.println("ABC");i++){
			System.out.println(i);
		}*/
		/*
		for(System.out.println(i);;i++){
			if(i<10){
				System.out.println(i);
			}
		}*/
		for(int j=0;j<20;j++){
			System.out.println("IN FOR:"+j);
			if(i==3)
				break;
			System.out.println("After Loop");
		}
		for(int j=0;j<20;j++){
			System.out.println("IN FOR:"+j);
			if(i==3)
				System.exit(0);
			System.out.println("After Loop");
		}
		for(int j=0;j<10;j++){
			if(i==3)
			{
				System.out.println("In FOR LOOP if"+i);
				System.exit(0);
			}
			System.out.println(i);
		}
		int k=0;
		for(k=0;k<10;k++)
			i=i++;
		System.out.println(i);
	}
}
class jtc25{
	public static void main(String arg[]){
		System.out.println("**SIMPLE IF***");
		if(true){
			System.out.println("True Block 1");
		}
		if(false){
			System.out.println("True Block 2");
		}
		if(false){
			System.out.println("True Block 3a");
			System.out.println("True Block 3b");
			System.out.println("True Block 3c");
		}
		if(false)
			System.out.println("True Block 4a");
		System.out.println("True Block 4b");
		System.out.println("True Block 4c");
		System.out.println("\n**IF-ELSE***");
		int ab=10;
		if(ab==10){
			System.out.println("ab value is Ten:"+ab);
		}else{
			System.out.println("ab value is not Ten:"+ab);
		}
		ab=90;
		if(ab==10){
			System.out.println("ab value is Ten:"+ab);
		}else{
			System.out.println("ab value is not Ten:"+ab);
		}
		System.out.println("\n**IF-ELSE***");
		int mn=0;
		if(mn++==0)
			System.out.println("Value is Zero");
		else if(mn++==1)
			System.out.println("Value is One");
		else if(mn++==2)
			System.out.println("Value is Two");
		else
			System.out.println("Value is 3");
		System.out.println("mn Value is:"+mn);
		int bn=0;
		if(++bn==0)
			System.out.println("Value is Zero");
		else if(++bn==1)
			System.out.println("Value is One");
		else if(bn++==2)
			System.out.println("Value is Two");
		else
			System.out.println("Value is 3");
		System.out.println("bn Value is:"+bn);
		int r=0;
		//if(r){}
		//if(r=8){}
		if(r==8){}
		boolean b1=false;
		if(b1){
			System.out.println("True Block First");
		}
		if(b1==true){
			System.out.println("True Block Second");
		}
		if(b1=true){
			System.out.println("True Block Third");
		}
		if(b1==true){
			System.out.println("True Block 4th");
		}
		int rt=10;
		if(rt!=10){
			System.out.println("OK 1");
		}
		if(rt!=10){}{
			System.out.println("OK 2");
		}
		if(rt++!=10);{
			System.out.println("OK 3");
		}
		System.out.println("Value of rt:"+rt);
		int cd=90;
		if(cd==87);
		else
			System.out.println(" Else ");
	}
}
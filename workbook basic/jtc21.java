class jtc21{
	public static void main(String arg[]){
		int ab=10;
		int bc=20;
		int res1=true?ab:bc;
		int res2=false?ab:bc;
		System.out.println(res1);
		System.out.println(res2);
		int res3=(ab>bc)?ab:bc;
		System.out.println(res3);
		//int res4=(ab>bc)?"Ten":bc;
		//String res5=(ab>bc)?"Ten":bc;
		//int res6=(ab>bc)?10.0:bc;
		double res7=(ab>bc)?10.0:bc;
		System.out.println(res7);
		//Valid from java 5
		Object obj=(ab>bc)?ab:"Twenty";//from java 5
		System.out.println(obj);
		int a=90;
		int b=456;
		int c=34;
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max);
	}
}
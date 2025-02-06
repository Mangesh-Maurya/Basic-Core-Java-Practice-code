class jtc2{
	public static void main(String arg[]){
		char ch1='A';
		//char ch2=''
		//char ch3='AB';
		char ch4='*';
		char ch5='7';
		System.out.println(ch1);
		System.out.println(ch4);
		System.out.println(ch5);
		char ch6=' ';
		char ch7='	';
		//char ch8='   ';
		//char ch9=''';
		char ch10='\'';
		//char ch11='\p';
		char ch12='\u0045';
		System.out.println(ch12);
		char ch13='\u00cf';
		System.out.println(ch13);
		//char ch14='-1';
		char ch15=65;
		System.out.println(ch15);
		char ch16=198;
		System.out.println(ch16);
		char ch17=65535;
		System.out.println("\n-----");
		for(char ch=0;ch<=255;ch++){
			int x=ch;
			System.out.println(x);
			System.out.println('\t');
			System.out.println(ch);
			System.out.println();
		}
	}
}
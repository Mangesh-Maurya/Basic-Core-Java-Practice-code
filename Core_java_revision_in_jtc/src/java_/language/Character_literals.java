package java_.language;

class Character_Literals {
	char ch1;
	char ch2 = ' ';
	char ch3 = ' ';
	// char ch4=''; -> Empty Character Literals is not Allowed.
	// char ch5=' . '; -> More then one symbol is not allowed in same pair of ' '.
	char ch6 = '"';
	// char ch7='''; -> not ok
	char ch8 = '\u0022';
	char ch9 = 'A';
	// char ch10='AB'; -> not ok
	char ch11 = '*';
	// char ch12=' '; -> not ok
	// char ch13='123'; -> not ok
	char ch14 = '1';
	char ch15 = 65;
	char ch16 = '\n'; // \n is an escape sequence character which represents new line
	char ch17 = '\t'; // \t :- one tab
	char ch18 = '\r'; // \r :- Carriage Return
	char ch19 = '\\';
	// char ch20='\'; -> not ok
	// char ch21='//'; -> not ok
	char ch22 = '/';
	char ch23 = '.';
	char ch24 = '%';
	char ch25 = '\u0001';
	char ch26 = '\'';
	int i1 = 'A';
	// int i2=A; -> not ok
	// int i3='AB'; -> not ok
	int i4 = '9';
	int i5 = '\u0022';
	int i6 = '\\';
	// int i7='\'; -> not ok
	int i8 = ' ';

	// int i9='123'; -> not ok
	void m1() {
		System.out.println("m1 in Hello");
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch6);
		System.out.println(ch8);
		System.out.println(ch9);
		System.out.println(ch11);
		System.out.println(ch14);
		System.out.println(ch15);
		System.out.println(ch16);
		System.out.println(ch17);
		System.out.println(ch18);
		System.out.println(ch19);
		System.out.println(ch22);
		System.out.println(ch23);
		System.out.println(ch24);
		System.out.println(ch25);
		System.out.println(ch26);
		System.out.println(i1);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i8);
	}
}

class JTC5 {
	public static void main(String[] args) {
		Character_Literals h1 = new Character_Literals();
		h1.m1();
	}
}


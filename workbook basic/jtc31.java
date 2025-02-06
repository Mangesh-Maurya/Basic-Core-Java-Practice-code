import java.io.*;
class jtc31{
	public static void main(String arg[])throws Exception{
		String val="";
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter int value");
		val=dis.readLine();
		int ab=Integer.parseInt(val);
		System.out.println("Enter String value");
		val=dis.readLine();
		char ch=val.charAt(0);
		System.out.println("Enter String value");
		val=dis.readLine();
		System.out.println(ab+"\t"+ch+"\t"+val);
		System.out.println(val.length());
	}
}
/*
byte by1=Byte.parseByte(val);
short sh=Short.parseShort(val);
int ab=Integer.parseInt(val);
long IVal=Long.parseLong(val);
float f1=Float.parseFloat(val);
double d1=Double.parseDouble(val);
//from java 5
boolean b1=Boolean.parseBoolean(val);
*/
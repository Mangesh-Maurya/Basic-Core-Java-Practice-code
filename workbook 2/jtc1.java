class jtc1{
public static void main(String[] args) {
MethodService serv = new MethodService();
serv.show('A');
byte by1 = 123;
serv.show(123);
serv.show(by1);
 //serv.show(123L);//error: incompatible types: possible lossy conversion from long to int
serv.show((int) 123L);
 //serv.display(123);//error: incompatible types: possible lossy conversion from long to int
serv.display((byte) 123);
serv.display(by1);
}
}
class MethodService {
void show(int ab) {
System.out.println("- show(int) \t:" + ab);
}
void display(byte by1) {
System.out.println("- display(byte) \t:" + by1);
}
}
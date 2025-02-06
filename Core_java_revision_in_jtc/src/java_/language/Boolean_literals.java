package java_.language;

public class Boolean_literals {

  boolean b1;
  boolean b2 = true;
  boolean b3 = false;
  // boolean b4=TRUE; -> not ok
  // boolean b5=FALSE; -> not ok
  // boolean b6=0; -> not ok
  // boolean b7=1; -> -> not ok
  Boolean b8 = true;
  Boolean b9 = false;
  Boolean b10;
  // Boolean b11=new Boolean(); -> not ok
  Boolean b12 = new Boolean(true);
  boolean b13 = Boolean.TRUE;
  boolean b14 = Boolean.FALSE;

  void m1() {
      System.out.println("m1 in Hello");
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
      System.out.println(b8);
      System.out.println(b9);
      System.out.println(b10);
      System.out.println(b12);
      System.out.println(b13);
      System.out.println(b14);
  }
}

class JTc {
  public static void main(String[] args) {
      Boolean_literals h1 = new Boolean_literals();
      h1.m1();
  }

}
            


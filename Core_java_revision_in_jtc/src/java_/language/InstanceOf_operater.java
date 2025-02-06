package java_.language;

public class InstanceOf_operater {

public static void main(String[] args) {
    JtcSuper j1 = new JtcSuper();
    
    System.out.println(j1 instanceof JtcSuper); // true
    System.out.println(j1 instanceof JtcSub); // false

JtcSub j2 = new JtcSub();

    System.out.println(j2 instanceof JtcSuper); // true
    System.out.println(j2 instanceof JtcSub); // true

}

}
class JtcSuper {}

class JtcSub extends JtcSuper {}

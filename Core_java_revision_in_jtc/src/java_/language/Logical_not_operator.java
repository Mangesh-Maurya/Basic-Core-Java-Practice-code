package java_.language;

public class Logical_not_operator {

public static void main(String[] args) {
int account = 0, pancard = 1, passport = 1; // 1-> available | 0-> not available

System.out.println(!(!(account == 1 && (pancard == 1 || passport == 1))));

    }
}           


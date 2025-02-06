package java_.language;

public class Unsigned_Right_shift_Operator {
   public static void main(String[] args) {
    	int a = -10;
		System.out.println("-10 :-      "+Integer.toBinaryString(a));
     	int res1 = (a >>> 1);
		System.out.println("-10 >>> 1 :- "+Integer.toBinaryString(res1));
		int b = 10;
		System.out.println("10 :-      "+Integer.toBinaryString(b));
     	int res2 = (b >>> 1);
		System.out.println("10 >>> 1 :- "+Integer.toBinaryString(res2));
   }

}
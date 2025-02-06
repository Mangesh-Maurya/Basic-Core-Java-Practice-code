package control.statement;

public class Unlabled_break {

public static void main(String[] args) {
System.out.println("------Unlabeled Break Statement-------");
for(int i = 0; i <= 10; i++){
   if(i == 5){
System.out.println("\nLoop terminated due to break statement...!");
   break;
//System.out.println("break statement must be the last statement inside their block...!");
       }
       System.out.print("i -> "+i);
   }
}
}

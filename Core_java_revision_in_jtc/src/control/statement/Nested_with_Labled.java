package control.statement;

public class Nested_with_Labled {

public static void main(String[] args) {
System.out.println("\n------Nested-loop with Labeled Break Statement-------");
    jtc: // lebel declr...
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j<=3; j++){
            if(j == 3){
                System.out.println("Outer-Loop terminated due to break statement...!");
                break jtc;
            }
            System.out.println("i -> "+i+" | j -> "+j);
        }
    }
}
}

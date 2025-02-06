package control.statement;

public class Nested_with_unlabled {

	public static void main(String[] args) {
    System.out.println("\n------Nested-loop with Unlabeled Break Statement-------");
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j<=3; j++){
            if(j == 3){
                System.out.println("Inner-Loop terminated due to break statement...!");
                break;
            }
            System.out.println("i -> "+i+" | j -> "+j);
        }
    }
}
}
            

package control.statement;

public class Labled_Continue_with_nested {

public static void main(String[] args) {
    System.out.println("\n-------Labeled Continue Statement with Nested-Loop-------");
    jtc: // Lebel Declr
    for(int j = 1; j <= 5; j++){
        for(int k = 1; k <= 5; k++){
            if(k == 3){
                System.out.println("Using Labeled Continue Statement Skiping the current iteration of Inner-Loop");
                continue jtc;
            }
        System.out.println("j -> "+j+" k -> "+k);
        }
    }
    }
}


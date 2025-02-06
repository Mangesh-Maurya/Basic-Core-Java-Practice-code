package control.statement;

public class Unlabled_Continue_with_nested {

public static void main(String[] args) {
    System.out.println("\n-------Unlabeled Continue Statement with Nested-Loop-------");
    for(int j = 1; j <= 5; j++){
        for(int k = 1; k <= 5; k++){
            if(k == 3){
                System.out.println("Using Unlabeled Continue Statement Skiping the current iteration of Inner-Loop");
                continue;
            }
        System.out.println("j -> "+j+" k -> "+k);
        }
    }
}
}


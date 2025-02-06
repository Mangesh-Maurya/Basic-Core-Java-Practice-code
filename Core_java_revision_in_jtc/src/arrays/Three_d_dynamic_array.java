package arrays;

public class Three_d_dynamic_array {

public static void main(String[] args) {

int ar1[][][] = new int[3][3][3];

for(int i = 0; i < ar1.length; i++){
    for(int j = 0; j < ar1[i].length; j++){
        for(int k = 0; k < ar1[i][j].length; k++){
            System.out.print(ar1[i][j][k] + " ");
}
System.out.println();
            }
        }
    }
}


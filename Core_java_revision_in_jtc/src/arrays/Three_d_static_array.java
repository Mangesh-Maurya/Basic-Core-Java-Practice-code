package arrays;

public class Three_d_static_array {

public static void main(String[] args) {

int ar1[][][] = {{{1,2,3},{4,5,6}},{{6,7,8},{56,3,-4},{12,0,43}}};

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


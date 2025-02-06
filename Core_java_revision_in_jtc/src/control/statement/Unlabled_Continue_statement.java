package control.statement;

public class Unlabled_Continue_statement {

public static void main(String[] args) {
		System.out.println("-------Unlabeled Continue Statement-------");
		for(int i = 1; i<= 10;i++){
			if(i == 5){
				System.out.println("Using Unlabeled Continue Statement Skiping the current iteration");
				continue;
			}
			System.out.print("i -> "+i);
		}
	}
}


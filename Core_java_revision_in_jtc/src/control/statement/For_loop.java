package control.statement;

public class For_loop {
	public static void main(String arg[]){
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i%7 == 0){
				sum += i;
			}
		}
		System.out.println("sum of all numbers which is div by 7:- "+sum);
	}
}


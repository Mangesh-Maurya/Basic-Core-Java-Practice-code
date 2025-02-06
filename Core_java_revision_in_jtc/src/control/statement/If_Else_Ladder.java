package control.statement;

public class If_Else_Ladder {
	public static void main(String arg[]){
		int num = 10;
		
		if(num > 0){
			System.out.println(num +" is a +ve number.");
		}else if(num == 0){
			System.out.println(num+" is a zero");
		}else{
			System.out.println(num+" is a -ve number");
		}
	}
}
         
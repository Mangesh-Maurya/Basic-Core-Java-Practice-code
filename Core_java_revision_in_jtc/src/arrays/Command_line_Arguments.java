package arrays;

public class Command_line_Arguments {

	public static void main(String arg[]){
		for(int i = 0; i <= arg.length-1; i++){
			System.out.println("arg["+i+"] :- "+arg[i]);
		}
	}
}


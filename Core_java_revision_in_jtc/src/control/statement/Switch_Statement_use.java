package control.statement;

import java.util.Scanner;

public class Switch_Statement_use {

	public static void main(String arg[]){
		System.out.println("******* WELCOME TO THE JTC ARITHMETIC CALCULATOR *******");
		System.out.println("_________________________________________________________");
		System.out.println("_____________________MAIN OPTION LIST____________________");
		System.out.println("Addition :- Press A");
		System.out.println("Subtraction :- Press S");
		System.out.println("Multiplication :- Press M");
		System.out.println("Division :- Press D");
		System.out.println("Modulus :- Press Mod");
		System.out.println("Waiting for your input....!");
		
		Scanner s1 = new Scanner(System.in);
		String input = s1.nextLine();
		int a,b;
		switch(input){
			case "A":
				System.out.println("Waiting for first operend :- ");
				a = s1.nextInt();
				System.out.println("Waiting for second operend :- ");
				b = s1.nextInt();
				System.out.println(a+" + "+b+" = "+(a+b));
				break;
			case "S":
				System.out.println("Waiting for first operend :- ");
				a = s1.nextInt();
				System.out.println("Waiting for second operend :- ");
				b = s1.nextInt();
				System.out.println(a+" - "+b+" = "+(a-b));
				break;
			case "M":
				case "Add":
				System.out.println("Waiting for first operend :- ");
				a = s1.nextInt();
				System.out.println("Waiting for second operend :- ");
				b = s1.nextInt();
				System.out.println(a+" x "+b+" = "+(a*b));
				break;
			case "D":
				System.out.println("Waiting for first operend :- ");
				a = s1.nextInt();
				System.out.println("Waiting for second operend :- ");
				b = s1.nextInt();
				System.out.println(a+" / "+b+" = "+(a/b));
				break;
			case "Mod":
				System.out.println("Waiting for first operend :- ");
				a = s1.nextInt();
				System.out.println("Waiting for second operend :- ");
				b = s1.nextInt();
				
				break;
			default:
				System.out.println("\n\n**************************************************");
				System.out.println("----You have selected an invalid option ----\u0002----");
				System.out.println("_____________________MAIN OPTION LIST____________________");
				System.out.println("Addition :- Press A");
				System.out.println("Subtraction :- Press S");
				System.out.println("Multiplication :- Press M");
				System.out.println("Division :- Press D");
				System.out.println("Modulus :- Press Mod");
				System.out.println("Waiting for your input....!");
		}
		
	}
}
       

package control.statement;

public class Unreachable_statement {

public static void main(String[] args) {

    // for(;false;){} :- error : unreachable statement

    //  while(false){} :- error : unreachable statement

    do{ 
        }while(false) ;
    System.out.println("No Error");
        

    }
}
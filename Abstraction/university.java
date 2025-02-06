class Bank_Account{
	void genID(){
	}
	void showID(Bank_Account b){
		s.genID();
	}
}
class bank_manager extends Bank_Account{
	void genID(){
		System.out.println("manage the all system");
	}
}
class cashier extends Bank_Account{
	void genID(){
		System.out.println("collect the money");
	}
}
class account_opener  extends Bank_Account{
	void genID(){
		System.out.println("open the account of costomer");
	}
}
class costomer extends Bank_Account{
	void genID(){
		System.out.println("bank service use");
	}
}
class bank1{
	public static void main(String arg[]){
		bank_manager b1=new bank_manager();
		cashier c1=new cashier();
		account_opener a1=new account_opener();
		
		Bank_Account b=new Bank_Account();
		b.showID(b1);
		b.showID(c1);
		b.showID(a1);
	}
}
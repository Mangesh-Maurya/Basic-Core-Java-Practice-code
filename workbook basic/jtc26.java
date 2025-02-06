class jtc26{
	public static void main(String arg[]){
		int ab=89;
		switch(ab){
			case 56:
			System.out.println("Fifty Six");
			case 89:
			System.out.println("Eighty Nine");
		}
		System.out.println("\n*********");
		int mn=27;
		final int xy=98;
		final byte BY1=67;
		switch(mn){
			case xy:
			System.out.println("final Variable Value");
			case 65:
			System.out.println("Twenty three");
			case 'B':
			System.out.println("Character B");
			case BY1:
			System.out.println("Byte Value");
			case 10+20-3:
			System.out.println("Byte Value");
		}
		System.out.println("\n**********");
		byte val=12;
		switch(val){
			case 88:
			System.out.println("Eighty Eight");
			case 'A':
			System.out.println("Character A");
		}
		System.out.println("\n*********");
		val=65;
		switch(val){
			default:
			System.out.println("Default-Value Not Matching");
			case 88:
			System.out.println("Eight Eight");
			case 'A':
			System.out.println("Character A");
		}
		System.out.println("\n*********");
		val=67;
		switch(val){
			default:
			System.out.println("Default- Value Not Matching");
			case 88:
			System.out.println("Eighty Eight");
			case 'A':
			System.out.println("Character A");
		}
		System.out.println("\n*********");
		val=67;
		switch(val){
			default:
			System.out.println("Default- Value Not Matching");break;
			case 88:
			System.out.println("Eighty Eight");break;	
			case 'A':
			System.out.println("Character A");
		}
	}
}
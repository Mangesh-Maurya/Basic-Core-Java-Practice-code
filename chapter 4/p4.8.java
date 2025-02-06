class jtc41{
	public static void main(String[] args){
		int i=3;
		final int i1=3;
		final int i2;
		i2=3;
		switch(1){
			case 1:
			System.out.println("ONE");
			break;
			case 2:
			System.out.println("TWO");
			break;
			/*case i:
			System.out.println("THREE");
			break;*/
			case i1:
			System.out.println("THREE i1");
			break;
			/*case i2:
			System.out.println("THREE i2");
			break;*/
			default:
			System.out.println("Default");
		}
	}
}
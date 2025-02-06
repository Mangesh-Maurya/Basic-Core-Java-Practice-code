class jtc10{
    public static  void main(String[] args){
		System.out.println("**MAIN METHOD**");
		System.out.println(Mno.VAL);
		//System.out.println(9090);
		System.out.println(Mno.VAL+100);
		//System.out.println(9190);
	}
}
class Mno{
	final static int VAL=9090;
	static{
		System.out.println("**STATIC BLOCK OF Mno\t:"+VAL);
	}
}
		
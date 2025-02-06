class jtc34{
	public static void main(String[] args){
        int i1=Integer.parseInt(args[0]);
	    int i2=Integer.parseInt(args[1]);
	    int i3=Integer.parseInt(args[2]);
		if((i1>i2)&&(i1>i3)){
		  System.out.println(i1);
		}else if((i2>i1)&&(i2>i3)){
	      System.out.println(i2);
		}else if((i3>i1)&&(i3>i2)){
	      System.out.println(i3);
		}
	}
}
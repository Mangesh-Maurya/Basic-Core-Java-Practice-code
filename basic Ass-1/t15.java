class t15{
	public static void main(String[] arg){
		boolean a=false;
		boolean b=false;
	  
			if(a){
				System.out.println("A");
			}
			else if(a&&b){
				System.out.println("A&&B");
			}
			else{
				if(!b){
					System.out.println("notB");
				}
				else{
					System.out.println("ELSE");
				}
			}
	}
}
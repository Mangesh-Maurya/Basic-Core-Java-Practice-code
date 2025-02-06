class L{
	public static void main(String arg[]){
		int ar1[]={12,25,26,11,45,32,28};
		int  low=ar1[0];
		for(int a=0;a<ar1.length; a++){
			for(int b=a+1; b<ar1.length;b++){
				if (ar1[b]<ar1[a]){
				   low=ar1[b]; 
				}
			}
		}
				  System.out.println(" lowest number " +low);
				
	}
}
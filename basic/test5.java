class garbagecollector{
	public void finalize(){
		System.out.println("garbagecollector");
	}
	public static void main(String [] agrs){
		garbagecollector gcd1= new garbagecollector();
		garbagecollector gcd2=new garbagecollector();
		
		gcd1=null;
		gcd2=null;
		System.out.println("OBJECT ASSIGNED NULL");
		System.gc();
	}
}
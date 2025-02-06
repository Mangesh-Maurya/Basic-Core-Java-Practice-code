class MyOuter
{
	public static class MyInner
	{
		public static void foo(){}
	}
}
class t20{
	public static void main(String[] arg){
		MyOuter.MyInner m=new MyOuter.MyInner();
		//MyOuter.MyInner mi=new MyInner();
		//MyOuter m=new MyOuter().MyOuter.MyInner mi=new MyOuter.MyInner();
		//MyOuter.MyInner mi=m.new MyOuter.MyInner();
	}
}
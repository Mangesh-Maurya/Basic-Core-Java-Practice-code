class Foo
{
	Foo()
	{
		System.out.println("foo");
	}
	class Bar
	{
		Bar()
		{
			System.out.println("bar");
		}
		public void go()
		{
			System.out.println("hi");
		}
	}
	public static void main(String [] args)
	{
		Foo f=new Foo();
		f.makeBar();
	}
	void makeBar()
	{
		(new Bar(){}).go();
	}
}
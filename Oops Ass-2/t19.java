class Foo
{
	class Bar{}
}
class Test
{
	public static void main(String[] args)
	{
		Foo f=new Foo();
//Foo.Bar b=new Foo.Bar();
		Foo.Bar b=f.new Bar();
		//Bar b=new f.Bar();
		//Bar b=f.new Bar();
	}
}
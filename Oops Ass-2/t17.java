class Boo
{
	Boo(String s){}
	Boo(){}
}
class Bar extends Boo
{
	Bar(){}
	Bar(String s){super(s);}
	void zoo()
	{
//Boo f=new Boo(24){};
Boo f=new Bar(){};
	//Bar f=new Boo(String s){};
	//Boo f=new Boo.Bar(String s){};
	}
}
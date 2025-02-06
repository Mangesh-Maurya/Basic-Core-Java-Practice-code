class jtc19{
	interface Inter11{
		void show();
	}
	interface inter22{
		int show();
	}
class  Cd implements Inter11,Inter22{
	public void show(){}
	public int show(){}
}
class Ab implements Inter11{
	public void show(){}
}
class Bc implements Inter22{
	public int show(){
		return 0;
	}
}// error: reached end of file while parsing
}
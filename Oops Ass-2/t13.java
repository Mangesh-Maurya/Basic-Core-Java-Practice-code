abstract class Tool{
	int SKU;
	abstract void getSKU();
}
class Hammer extends Tool{
	void getSKU(){
		System.out.println("void getSKU");
	}
	/*private void getSKU(){
		System.out.println("private void getSKU");
	}*/
	protected void getSKU(){
		System.out.println("protected void getSKU");
	}
	public void getSKU(){
		System.out.println("public void getSKU");
	}
}
	
	
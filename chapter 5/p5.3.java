class Hello{
	public int hashCode(){
		return 4;
	}
	public String toString(){
		return this.getClass().getName()+":@:"+Integer.toHexString(hashCode());
}}
class Hai{
}
class jtc46{
	public static void main(String[] args){
		Hello h1[]=new Hello[2];
		h1[0]=new Hello();
		//h1[1]=new Hai();
		Object o[]=new Object[2];
		o[0]=new Hello();
		o[1]=new Hai();
		for(int i=0;i<o.length;i++){
			System.out.println(o[i]);
}}}
class Hello{
}
class jtc44{
	public static void main(String[] args){
		int a[]={11,22,33,44};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"\t"+i);
		}
		System.out.println("***********");
		Hello h1=new Hello();
		System.out.println(h1);
		System.out.println(a);
		System.out.println(h1.hashCode());
		System.out.println(a.hashCode());
		System.out.println("Dynamic array");
		int a1[]=new int[4];
		for(int i=0; i<a1.length;i++){
			System.out.println(a1[i]+"\t"+i);
		}
		a1[0]=11;
		a1[1]=22;
		a1[2]=33;
		a1[3]=44;
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
			System.out.println("a1.hashcode:"+a1.hashCode());
			System.out.println("lengh of array:"+a1.length);
		}
		//a1.length=10;
		a1=new int[5];
		System.out.println(a1.hashCode());
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
	}
}
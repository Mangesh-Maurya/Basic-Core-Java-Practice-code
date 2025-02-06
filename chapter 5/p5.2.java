class jtc45{
	public static void main(String[] args){
		char ch[]=new char[10];
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		System.out.println("**************");
		System.out.println(ch.hashCode());
		System.out.println(ch.length);
		/*for(char ch1='\u0000';ch1<='\00ff';ch1++){
			System.out.println(ch1);
		}*/
		Hello h1[]=new Hello[5];
		Hello h11=new Hello();
		System.out.println(h11);
		for(int i=0;i<h1.length;i++){
			System.out.println(h1);
		}
		String str1[]={"abc","xyz","mno"};
		for(int i=0;i<str1.length;i++){
			System.out.println(str1[i]+"	"+str1[i].length());
		}
	}
}
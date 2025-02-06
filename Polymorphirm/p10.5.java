class Animal{
	int a=10;
	int b=20;
	static int c=30;
	void eating(){
		System.out.println("Animal is eating");
	}
	int sleeping(){
		System.out.println("Animal is sleeping");
		return 10;
	}
	void thinking(){
		System.out.println("Animal is thinking");
	}
	static void seeing(){
		System.out.println("Animal is seeing");
	}
}
class Dog extends Animal{
	int a=101;
	int b=202;
	static int c=303;
	void eating(){
		System.out.println("Dog is eating");
	}
	int sleeping(){
		System.out.println("Dog is sleeping");
		return 10;
	}
	static void seeing(){
		System.out.println("Dog is seeing");
	}
	void barking(){
		System.out.println("Dog is barking");
	}
}
class Cat extends Dog{
	void eating(){
		System.out.println("Cat is eating");
	}
	static void seeing(){
		System.out.println("Cat is seeing");
	}
	void drinking(){
		System.out.println("Cat is drinking");
	}
}
class jtc112{
	public static void main(String arg[]){
		Animal ani1=new Animal();
		ani1.eating();
		ani1.thinking();
		ani1.seeing();
		Dog dog1=new Dog();
		dog1.eating();
		dog1.thinking();
		dog1.seeing();
		dog1.barking();
		System.out.println("*******************\n");
		Animal ani2=null;
		ani2=new Dog();
		ani2.eating();
		ani2.thinking();
		ani2.seeing();
		//ani2.barking();//error: cannot find symbol
		System.out.println(ani2.a);// doubt
		System.out.println(ani2.c);// doubt
		Animal ani3= new Cat();
		ani3.eating();
		ani3.seeing();
		//ani3.drinking();//error: cannot find symbol
	}
}
	
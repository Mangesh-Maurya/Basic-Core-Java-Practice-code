class jtc9{
	public static void main(String[] args){
		System.out.println("**MAIN METHOD**");
		new Student();
		System.out.println("--Student Object created--\n");
		new Employee();
		System.out.println("Employee Object created--\n");
	}
}
class Person{
	static{
		System.out.println("\n--static of Person--");
	}
	Person(){
		System.out.println("--person()Cons--");
	}
}
class Student extends Person{
	static{
		System.out.println("--Static of student--");
	}
	Student(){
		System.out.println("-- Student() Cons--");
	}
}
class Employee extends Person{
	static{
		System.out.println("Static of employee");
	}
}
		
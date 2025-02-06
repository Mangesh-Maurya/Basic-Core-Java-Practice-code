package hashcode.equals.method;

class Employee{
	int empid;
	String name;
	String city;
	long phone;
	public Employee() {
		
	}
	public Employee(int empid, String name, String city, long phone) {
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		
		return 99;
	}
	public boolean equals(Object o) {
		Employee e = (Employee)o;
		if((e.empid==this.empid)&&(e.name.equals(this.name))&&(e.city.equals(this.city)))
				return true;
		return false;
	}
}

public class Jtc {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1);
		Employee e2=new Employee(101,"som","noida",9506);
		Employee e3=new Employee(101,"som","noida",9506);
		Employee e4=new Employee(101,"som1","noida",9506);
		Employee e5=new Employee(101,"som3","noida",9506);
		System.out.println(e2==e3);//false
		boolean bn = e2.equals(e3);
		System.out.println(bn);
		System.out.println(e2.equals(e4));
	}

}

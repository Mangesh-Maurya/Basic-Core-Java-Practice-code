package oops_;

public class Instance_Variable_ {

	public static void main(String arg[]){

		Student s1 = new Student();
		s1.sid = 101;
		s1.sname = "Vivek";
		s1.semail = "vivek@jtcindia.org";

		Student s2 = new Student();
		s2.sid = 102;
		s2.sname = "Rahul";
		s2.semail = "rahul@jtcindia.org";

		System.out.println("----Student Details----");
		System.out.println("s1.sid :- "+s1.sid);
		System.out.println("s1.sname :- "+s1.sname);
		System.out.println("s1.semail :- "+s1.semail);
		System.out.println("----Student Details----");
		System.out.println("s2.sid :- "+s2.sid);
		System.out.println("s2.sname :- "+s2.sname);
		System.out.println("s2.semail :- "+s2.semail);
	}
}
class Student{
	int sid;
	String sname;
	String semail;
}


package oops_;

public class Static_Variable_ {

	public static void main(String arg[]){
		Student12 s1 = new Student12();
		s1.sid = 101;
		s1.sname = "Vivek";
		s1.semail = "vivek@jtcindia.org";

		Student12 s2 = new Student12();
		s2.sid = 102;
		s2.sname = "Rahul";
		s2.semail = "rahul@jtcindia.org";

		System.out.println("----Student Details----");
		System.out.println("s1.sid :- "+s1.sid);
		System.out.println("s1.sname :- "+s1.sname);
		System.out.println("s1.semail :- "+s1.semail);
		System.out.println("s1.snationality :- "+s1.snationality);
		System.out.println("s2.sid :- "+s2.sid);
		System.out.println("s2.sname :- "+s2.sname);
		System.out.println("s2.semail :- "+s2.semail);
		System.out.println("s2.snationality :- "+s2.snationality);
	}
}
class Student12{
	int sid;
	String sname;
	String semail;
	static String snationality = "Indian";
}



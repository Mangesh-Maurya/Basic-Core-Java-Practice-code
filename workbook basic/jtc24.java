class jtc24{
	public static void main(String arg[]){
		int ab=7514;//01110101011010;
		System.out.println(ab);
		System.out.println(ab<<0);
		System.out.println(ab<<2);
		System.out.println(ab<<3);
		System.out.println(ab<<20);
		System.out.println(ab<<32);
		System.out.println(ab<<34);
		System.out.println(ab<<35);
		System.out.println(ab<<52);
		System.out.println(7514L<<34);
		System.out.println(7514L<<35);
		System.out.println(7514L<<64);
		System.out.println(7514L<<98);
		System.out.println("--->>+ve value---");
		System.out.println(746238>>0);
		System.out.println(746238>>3);
		System.out.println(746238>>6);
		System.out.println(746238>>32);
		System.out.println(746238>>35);
		System.out.println("--->>-ve Value---");
		System.out.println(-1248547>>0);
		System.out.println(-1248547>>3);
		System.out.println(-1248547>>6);
		System.out.println(-1248547>>32);
		System.out.println(-1248547>>35);
		System.out.println("-->>>+ve value--");
		System.out.println(746238>>>0);
		System.out.println(746238>>>3);
		System.out.println(746238>>>6);
		System.out.println(746238>>>32);
		System.out.println(746238>>>35);
		System.out.println("-->>>-ve Value--");
		System.out.println(-1248547>>>0);
		System.out.println(-1248547>>>1);
		System.out.println(-1248547>>>3);
		System.out.println(-1248547>>>6);
		System.out.println(-1248547>>>32);
		System.out.println(-1248547>>>35);
	}
}
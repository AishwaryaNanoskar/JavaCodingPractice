package kpibi;

/*
 * IMP
 * */
public class ProgramEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JavaJ2eeStrutsHibernate";

		String s2 = "StrutsHibernateJavaJ2ee";

		if (s1.length() != s2.length()) {
			System.out.println("S2 is not rotational version of S1");
		} else {
			String s3 = s1 + s2;
			System.out.println(s3);
			if (s3.contains(s2)) {
				System.out.println("S2 is rotational version of S1");
			} else {
				System.out.println("S2 is not rotational version of S1");

			}
		}
	}

}

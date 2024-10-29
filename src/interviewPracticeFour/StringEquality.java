package interviewPracticeFour;

public class StringEquality {
	public static void main(String[] args) {
		String s2 = "HELLO";
		String s1 = "HELLO";
		String s3 =  new String("HELLO");

		System.out.println(s1 == s2); 
		System.out.println(s1 == s3);
	}
}

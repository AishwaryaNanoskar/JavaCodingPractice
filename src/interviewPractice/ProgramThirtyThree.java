package interviewPractice;

/*Write a Java program to prove strings are immutable in java. Refer solution for knowing what are 
 * immutable strings
*/
public class ProgramThirtyThree {

	public static void main(String[] args) {
		String s1 = "abc";
		
		String s2 = "abc";
		
        System.out.println(s1 == s2);         //Output : true
        
        s1 = s1 + "J2EE";
        
        System.out.println(s1 == s2);		//Output : false
	}

}

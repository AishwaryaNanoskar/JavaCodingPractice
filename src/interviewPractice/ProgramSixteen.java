package interviewPractice;

import java.util.ArrayList;

/*Write a Java program to remove duplicate elements from already constructed ArrayList.
 *  This program is one of the collection interview programs in Java.
*/
public class ProgramSixteen {

	public static void main(String[] args) {

		String input[] = { "JAVA", "J2EE", "JSP", "SERVLETS", "JAVA", "STRUTS", "JSP" };

		ArrayList listOne = new ArrayList();

		for (int i = 0; i < input.length; i++) {
			listOne.add(input[i]);
		}
		
		for (int i = 0; i < listOne.size(); i++) {
			for (int j = i + 1; j < listOne.size(); j++) {
				if (listOne.get(i) == listOne.get(j)) {
					listOne.remove(i);
				}
			}
		}

		System.out.println(listOne);
	}

}

package kpibi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ProgramSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "JAVA", "J2EE", "JSP", "SERVLETS", "JAVA", "STRUTS", "JSP" };

		List<String> data = new ArrayList<String>();

		for (String inpStr : str) {
			if (!data.contains(inpStr)) {
				data.add(inpStr);
			}
		}
		System.out.println(data);
	}

}

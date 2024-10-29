package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ProgramSixteen {
	public static void main(String[] args) {

		// Constructing an array list
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("J2EE");

		listWithDuplicateElements.add("JSP");

		listWithDuplicateElements.add("SERVLETS");

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("STRUTS");

		listWithDuplicateElements.add("JSP");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String data : listWithDuplicateElements) {
			map.put(data, map.getOrDefault(data, 0) + 1);
		}

//		System.out.println(map);
		Iterator<Entry<String, Integer>> i = map.entrySet().iterator();

		while (i.hasNext()) {
			Entry<String, Integer> dt = i.next();
			if (dt.getValue() > 1) {
				System.out.println("" + dt.getKey() + ": " + dt.getValue());
			}
		}

	}
}

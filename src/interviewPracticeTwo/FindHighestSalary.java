package interviewPracticeTwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindHighestSalary {
	public static void main(String[] args) {
		Map<String, Integer> data = new Hashtable<String, Integer>();
		data.put("Alice", 50000);
		data.put("Bob", 60000);
		data.put("Charlie", 5000);
		data.put("David", 70000);
		data.put("Eve", 60000);

		List<Integer> ls = new ArrayList<Integer>();

		Iterator<Entry<String, Integer>> i = data.entrySet().iterator();
		while (i.hasNext()) {
			Entry<String, Integer> dt = i.next();
			ls.add(dt.getValue());
		}
		ls.sort(Comparator.reverseOrder());
		
		System.out.println(ls.get(1));

	}
}

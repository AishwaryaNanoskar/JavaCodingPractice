package kpibi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgramFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Better Butter";

		char c[] = str.toCharArray();

		Map<Character, Integer> data = new HashMap<Character, Integer>();
		for (char a : c) {
			if (data.containsKey(a)) {
				data.put(a, data.get(a) + 1);
			} else {
				data.put(a, 1);
			}
		}

		System.out.println("Duplicate data: ");
		Iterator<Map.Entry<Character, Integer>> i = data.entrySet().iterator();

		while (i.hasNext()) {
			Map.Entry<Character, Integer> dt = i.next();

			if (dt.getValue() >= 2) {
				System.out.print("" + dt.getKey() + " : " +dt.getValue()+" , ");

			}

		}
	}

}

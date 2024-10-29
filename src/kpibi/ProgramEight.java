package kpibi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ProgramEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// getOrDefault method explanation
		/*
		 * default V getOrDefault(Object key, V defaultValue) 
		 * { 
		 * V v; return (((v = get(key)) != null) || containsKey(key)) ? v : defaultValue; 
		 * }
		 */
		int arr[] = { 1, 4, 5, 2, 7, 8, 10, 1, 2 };

		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		for (int dup : arr) {
			data.put(dup, data.getOrDefault(dup, 0) + 1);
		}

		System.out.println("Duplicate values are: "+data);

		for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(" " + entry.getKey());

			}
		}

	}

}

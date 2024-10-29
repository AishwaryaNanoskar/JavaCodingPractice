package kpibi;

import java.util.HashMap;
import java.util.Map;

public class ProgramFourtySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 9, 12, 9, 10, 9, 10, 11 };

		Map<Integer, Integer> data = new HashMap<Integer, Integer>();

		for (int d : a) {
			data.put(d, data.getOrDefault(d, 0) + 1);
		}
		
		System.out.println(data);

	}

}

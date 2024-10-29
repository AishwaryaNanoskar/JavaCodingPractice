package kpibi;

import java.util.ArrayList;
import java.util.List;

//Important
public class ProgramFifteen {
	public static void main(String[] args) {
		int a[] = { 12, 5, 31, 9, 21, 8};
		int target = 45;

		List<Integer> data = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				data.add(a[j]);
				if (sum == target) {
					System.out.println(data);
				} else if (sum > target) {
					break;
				}
			}
			data.clear();
		}
	}
}

package kpibi;

import java.util.ArrayList;
import java.util.List;

public class ProgramNinetySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, -9, 4, -2, 7, 1, -4, -3, -7 };

		int target = -7;

		List<Integer> data = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			// Every time the sum will start fresh and will be assigned to 0
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				data.add(a[j]);
				if (sum == target) {
					System.out.println(data);
					// data gets cleared when consecutive elements whose sum is equal to target
					// is found
					break;
				}

			}
			
			data.clear();
		}

	}

}
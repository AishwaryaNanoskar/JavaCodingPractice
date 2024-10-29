package kpibi;

import java.util.ArrayList;
import java.util.List;

public class ProgramTwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 14, 9, 11, 7, 8, 5, 3, 12 };

		List<Integer> prevData = new ArrayList<Integer>();

		for (int prev : a) {
			prevData.add(prev);
		}

		List<Integer> data = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (!(a[i] > a[j]) && !(data.contains(a[i]))) {
					data.add(a[i]);
				}
			}
		}

		for (int removeData : data) {
			if (prevData.contains(removeData)) {
				// Remove method takes index and not the actual data
				//Integer.valueOf is used to remove the data 
				prevData.remove(Integer.valueOf((removeData)));
			}
		}

		System.out.println(prevData);
	}

}

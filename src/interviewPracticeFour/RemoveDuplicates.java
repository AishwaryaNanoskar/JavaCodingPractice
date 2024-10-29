package interviewPracticeFour;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 4, 6, 4, 7, 6 };

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i]))
				list.add(a[i]);
		}
		
		System.out.println(list);

	}
}

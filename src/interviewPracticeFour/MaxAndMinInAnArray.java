package interviewPracticeFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMinInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 3, 7, 8, 9, 2 };
		List<Integer> list = new ArrayList<Integer>();
		for (Integer data : a) {
			list.add(data);
		}
		Collections.sort(list);
		System.out.println("Sorted list is: " + list);
		System.out.println("Max element is: " + list.get(list.size() - 1) + " Min element is: " + list.get(0));
	}

}

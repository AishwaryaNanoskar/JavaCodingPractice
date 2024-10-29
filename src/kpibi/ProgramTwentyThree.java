package kpibi;

import java.util.ArrayList;
import java.util.List;

public class ProgramTwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 14, 0, 5, 2, 0, 3, 0 };

		List<Integer> arrayOne = new ArrayList<Integer>();

		List<Integer> arrayTwo = new ArrayList<Integer>();

		for (Integer newData : a) {
			if (!newData.equals(0)) {
				arrayOne.add(newData);
			} else {
				arrayTwo.add(newData);
			}
		}
		//array 1 + array 2 = data of array 2 is added to array 1
		arrayOne.addAll(arrayTwo);
		System.out.println(arrayOne);
	}

}

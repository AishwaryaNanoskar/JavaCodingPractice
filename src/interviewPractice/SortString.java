package interviewPractice;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SortString {

	public static void main(String[] args) {
		String input = "Banana, Apply, Fig, Zamun";

		String valuesData[] = input.split(",");

		ArrayList<String> values = new ArrayList<String>();

		ArrayList<String> valuesSorted = new ArrayList<String>();

		for (int i = 0; i < valuesData.length; i++) {
			values.add(valuesData[i].trim().toLowerCase());
		}

		/*
		 * Sorting using streams Stream<String> sortedData = values.stream();
		 * 
		 * Stream<String> sortedArray = sortedData.sorted(); sortedArray.forEach(n ->
		 * System.out.println(n)); System.out.println("Before array is: " +
		 * sortedArray);
		 */
		System.out.println("Before array is: " + values);

		for (char c = 'a'; c <= 'z'; c++) {
			for (int j = 0; j < valuesData.length; j++) {
				if (values.get(j).trim().charAt(0) == c) {
					valuesSorted.add(values.get(j));
				}
			}
		}
		
		StringBuilder bindString = new StringBuilder();
		for (int i = 0; i < valuesSorted.size(); i++) {
			if(i!=valuesSorted.size()-1) {
				bindString.append(valuesSorted.get(i));
				bindString.append(",");
			} else {
				bindString.append(valuesSorted.get(i));
			}
		}
		
		System.out.println("Before array is: " + bindString);

	}

}

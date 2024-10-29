package kpibi;

import java.util.ArrayList;

/*Problem statement
 * I/p = "two one nine six eight one six four double zero triple one";
 * O/p = "2196816400111"
 * */
public class IbmCodingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		String aValue[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String num = "two one nine six eight one six four double zero triple one";
		
		String arr[] = num.split(" ");


		StringBuilder str = new StringBuilder();
		
		int i = 0;
		for (int value = 0; value < arr.length; value++) {
			if (i < arr.length) {
				
				if (i < arr.length) {
					if (arr[i].equals("double")) {
						for (int j = 0; j < aValue.length; j++) {
							if (arr[i + 1].equals(aValue[j])) {
								for (int k = 0; k < 2; k++) {
									str.append(a[j]);

								}
								break;
							}

						}
						i += 2;
					}
				}
				
				if (i < arr.length) {
					if (arr[i].equals("triple")) {
						for (int j = 0; j < aValue.length; j++) {
							if (arr[i + 1].equals(aValue[j])) {
								for (int k = 0; k < 3; k++) {
									str.append(a[j]);

								}
								break;
							}

						}
						i += 2;
					}
				}
				
				if (i < arr.length) {
					if (!arr[i].equals("double") && !arr[i].equals("triple")) {
						for (int j = 0; j < aValue.length; j++) {
							if (arr[i].equals(aValue[j])) {
								str.append(a[j]);
							}
						}
						i++;
					}
				}
				
			}
		}
		
		System.out.println(str);

	}

}

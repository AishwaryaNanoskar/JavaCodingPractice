package SmartProgramming.Collections;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {

		String input = "Aish, Sona, Carrot";

		String[] checkValue = input.split(",");
		System.out.print("" + checkValue.length);

		for (int i = 0; i < checkValue.length; i++) {
			for (int j = 0; j < checkValue.length; j++) {
				if (checkValue[i].charAt(j) > checkValue[i+1].charAt(j)) {
					System.out.print(true);
				} else {
					System.out.print(false);
				}
			}
			
			
			
		}

//		Arrays.sort(checkValue);
//		 System.out.printf("Modified arr[] : \n%s\n\n",
//                 Arrays.toString(checkValue));
//		
//		for(int i = 0; i < checkValue.length; i++) {
//			
//		}
//		
//		for (String value : checkValue) {
//
//			System.out.print("" + value);
//		}
//
	}

}

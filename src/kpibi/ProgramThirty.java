package kpibi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramThirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tiger Runs @ The Speed Of 100 km/hour.";

		char c[] = str.toCharArray();
		
		int totalChar = c.length;
		
		String regex = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";

		int upperCaseCount = 0;
		for (int i = 0; i < c.length; i++) {
			for (char a = 'A'; a <= 'Z'; a++) {
				if (c[i] == a) {
					upperCaseCount++;
				}
			}
		}
		
		//Upper case percentage
		double upperCaseCountPercentage = (upperCaseCount * 100.0)/totalChar;
		System.out.println("Upper case percentage: "+upperCaseCountPercentage);
		
		int lowerCaseCount = 0;
		for (int i = 0; i < c.length; i++) {
			for (char a = 'a'; a <= 'z'; a++) {
				if (c[i] == a) {
					lowerCaseCount++;
				}
			}
		}
		
		//Lower case percentage
		double lowerCaseCountPercentage = (lowerCaseCount * 100.0)/totalChar;
		System.out.println("Lower case percentage: "+lowerCaseCountPercentage);
		
		int numberCount = 0;
		for (int i = 0; i < c.length; i++) {
			if(Character.isDigit(c[i]));
				numberCount++;
		}
		
		//Number percentage
		double numberCountPercentage = (numberCount * 100.0)/totalChar;
		System.out.println("Number percentage: "+numberCountPercentage);
		
//		int specialCharCount = 0;
//        for(int i=0;i<c.length;i++) {
//        	if(regex.contains(c[i])) {
//        		
//        	}
//        }

	}

}

package kpibi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgramNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };

		String[] s2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		List<String> strOne = new ArrayList<String>();

		Set<String> outPutData = new HashSet<String>();

		for (String inpString : s1) {
			strOne.add(inpString);
		}

		for (String dataCompare : s2) {
			if (strOne.contains(dataCompare)) {
				outPutData.add(dataCompare);
			}
		}

		System.out.println(outPutData);
	}

}

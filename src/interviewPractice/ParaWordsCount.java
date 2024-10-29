package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class ParaWordsCount {

	public static void main(String[] args) {

		String input = "You are on Tutorials Point website are website";

		String inputData[] = input.toUpperCase().split(" ");

		Map<String, Integer> mapData = new HashMap<String, Integer>();

		for (int i = 0; i < inputData.length; i++) {
			if (mapData.containsKey(inputData[i])) {
				mapData.put(inputData[i], mapData.get(inputData[i]) + 1);
			} else {
				mapData.put(inputData[i], 1);
			}
		}
		System.out.println("" + mapData);
	}

}

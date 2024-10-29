package kpibi;

public class ProgramSeventyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Concept Of The Day";

		char strArray[] = str.toLowerCase().toCharArray();

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		StringBuilder vowelsRemove = new StringBuilder();
		
		//when we do one to many comparison the many values should be compared
		//in the inside loop and the one value should be compared from the outside
		//loop
		for (int j = 0; j < strArray.length; j++) {
			int count = 0;
			for (int i = 0; i < vowels.length; i++) {
				//if there is no character in strArray which is present in vowel the
				//the count will remain 0
				if (strArray[j] == vowels[i]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				vowelsRemove.append(strArray[j]);
			}
		}
		System.out.println(vowelsRemove);
	}

}

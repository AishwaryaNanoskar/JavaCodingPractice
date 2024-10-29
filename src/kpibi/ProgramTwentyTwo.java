package kpibi;

public class ProgramTwentyTwo {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";

		String strInp[] = str.split(" ");

		StringBuilder strBuil = new StringBuilder();
		for (int i = 0; i < strInp.length; i++) {
			for (int j = strInp[i].length() - 1; j >= 0; j--) {
				strBuil.append(strInp[i].charAt(j));
			}
			strBuil.append(" ");
		}

		System.out.println(strBuil);
	}

}

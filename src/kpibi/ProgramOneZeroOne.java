package kpibi;

public class ProgramOneZeroOne {
	public static void main(String[] args) {
		String str = "Java";

		char subArray[] = str.toCharArray();

		StringBuilder strBuil = new StringBuilder();

		for (int i = 0; i < subArray.length; i++) {
			for (int j = i; j < subArray.length; j++) {
				strBuil.append(subArray[j]);
				System.out.println("" + strBuil);
			}
			// Setting StringBuilder to zero because new sub array will
			// be created i.e., an empty string.
			strBuil.setLength(0);
		}
	}
}

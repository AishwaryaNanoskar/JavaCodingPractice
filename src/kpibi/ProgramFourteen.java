package kpibi;

public class ProgramFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 5, 7, 11, 9, 13, 8, 12 };

		int target = 20;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == target) {
					System.out.println("(" + a[i] + "," + a[j] + ")");
					break;
				}
			}
		}
	}

}

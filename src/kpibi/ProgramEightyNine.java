package kpibi;

public class ProgramEightyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4, n = 0;

		for (int j = 1; j <= 4; j++) {
			n = k;
			while (n != 0) {
				System.out.print(" ");
				n--;
			}
			k--;
			for (int d = 0; d < j; d++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		int a = 1, w = 0;
		for (int t = 3; t >= 0; t--) {

			w = a;
			while (w != 0) {
				System.out.print(" ");
				w--;
			}
			for (int e = 0; e < t; e++) {
				System.out.print(" * ");

			}
			System.out.println();

			a++;
		}

	}

}

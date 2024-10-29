package kpibi;

public class ProgramTwo {

	public static void main(String[] args) {
		int n=9;
		for (int k = 1; k <= 9; k++) {
			for (int j = n; j > 0; j--) {
				System.out.print(" ");
			}

			for (int i = 1; i <=k; i++) {
				System.out.print(" "+k+" ");
			}
			System.out.println("");
			n--;
		}

	}

}

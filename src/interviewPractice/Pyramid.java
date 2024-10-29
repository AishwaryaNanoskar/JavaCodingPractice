package interviewPractice;

public class Pyramid {
	public static void main(String ar[]) throws Exception {

		int itr = 10;
		for (int i = 0; i <= itr; i++) {
			for (int j = itr; j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i + 1; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
			itr--;
		}
	}
}

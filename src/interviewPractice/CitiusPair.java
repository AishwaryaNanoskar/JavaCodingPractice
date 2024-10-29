package interviewPractice;

public class CitiusPair {
	public static void main(String[] args) {
		int a[] = { 2, 6, 3, 9, 11, 4, 5 };

		int target = 9;


		for (int i = 0; i < a.length - 1; i++) {
			for (int j= i; j < a.length; j++) {
				if((a[i] + a[j]) == target) {
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}

	}
}

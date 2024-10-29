package interviewPracticeFour;

public class ReverseArray {
	public static void main(String ar[]) throws Exception {
		int a[] = { 4, 3, 5, 6, 7, 8 };

		int j = a.length - 1;
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}

		for (int k = 0; k < a.length; k++)
			System.out.print(a[k] + " ");

	}
}

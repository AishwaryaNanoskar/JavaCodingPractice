package oopsPrograms;

public class PrintOneToTenUsingRecursion {

	static void recursion(int num) {
		if (num > 1) {
			recursion(num - 1);
		}
		System.out.println(num);

	}

	public static void main(String[] args) {
		recursion(10);
	}
}

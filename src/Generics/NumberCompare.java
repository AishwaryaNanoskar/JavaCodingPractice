package Generics;

public class NumberCompare {

	public static <T extends Comparable<T>> T returnNum(T num1, T num2) {
		if (num1.compareTo(num2) < 0)
			return num1;

		return num2;
	}

	public static void main(String[] args) {
		System.out.println(returnNum(23, 43));
	}

}

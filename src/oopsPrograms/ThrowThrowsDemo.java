package oopsPrograms;

public class ThrowThrowsDemo {

	public static void validateDate(int age) throws IllegalArgumentException {
		if (age < 18) {
			throw new IllegalArgumentException("Age must be above 18");
		} else {
			System.out.println("Age is a valid");
		}
	}

	public static void main(String[] args) {
		try {
			validateDate(17);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught: " + e);
		}
	}
}

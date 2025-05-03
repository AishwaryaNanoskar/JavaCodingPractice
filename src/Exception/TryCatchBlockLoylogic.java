package Exception;

public class TryCatchBlockLoylogic {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException a) {
			System.out.println(a);
		} finally {
			System.out.println("This block throws an Exception");
		}

	}
}

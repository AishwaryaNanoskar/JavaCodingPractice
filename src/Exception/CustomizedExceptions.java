package Exception;

class CustomExceptionHandling extends Exception {

	public CustomExceptionHandling(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}

public class CustomizedExceptions {
	public static void main(String[] args) {
		int i = 20, j = 0;

		try {
			j = 18 / i;
			//System.out.println(j);
			if (j == 0)
				throw new CustomExceptionHandling("This is a custom Exception");
		} catch (CustomExceptionHandling a) {
			j = 18 / 1;
			System.out.println("That's the default output " + a);
		}

	}
}

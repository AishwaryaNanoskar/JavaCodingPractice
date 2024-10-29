package oopsPrograms;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		} catch(Exception io) {
			throw new NullPointerException("xyz");
		} finally {
			System.exit(0);
			System.out.println("This is null pointer exception");
		}
	}
}

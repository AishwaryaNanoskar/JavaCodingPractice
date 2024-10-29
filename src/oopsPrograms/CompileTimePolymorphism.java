package oopsPrograms;

public class CompileTimePolymorphism {

	void add(int a, int b) {
		System.out.println(a * b);
	}

	void add(double a, double b) {
		System.out.println(a * b);
	}

	void add(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism c = new CompileTimePolymorphism();
		c.add(1, 2); // This method run time calls the method having two integer parameters
		c.add(1.2, 2.3); // This method run time calls the method having two double parameters
		c.add(1, 2, 3); // This method run time calls the method having three integer parameters

	}
}

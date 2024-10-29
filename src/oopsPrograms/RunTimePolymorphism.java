package oopsPrograms;

class Test {
	void run() {
		System.out.println("The dog is running");
	}
}

public class RunTimePolymorphism extends Test {

	// The method run() from Test class is overridden in the child class i.e,
	// RunTimePolymorphism
	void run() {
		System.out.println("The cat is running");
	}

	public static void main(String[] args) {
		Test t = new RunTimePolymorphism();
		t.run();
	}
}

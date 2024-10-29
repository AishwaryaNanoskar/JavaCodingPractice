package interviewPractice;

class Test {
	public void method() {
		System.out.println("Method 1");
	}
}

public class RunTimePloymorphism extends Test {
	public void method() {
		System.out.println("Method 2");
	}
	
	public static void main(String ar[]) throws Exception {
		Test test = new RunTimePloymorphism();
		test.method();
	}
}

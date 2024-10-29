package interviewPractice;

class A {
	protected int data = 10;

	public void printData() {
		System.out.println("" + this.data);
	}
}

class B extends A {

	protected int data = 20;

	public void printData() {
		System.out.println("" + this.data);
	}
}

public class TestMe {
	public static void main(String ar[]) {
		A obj = new B();
		obj.printData();

		System.out.println("" + obj.data);

	}
}

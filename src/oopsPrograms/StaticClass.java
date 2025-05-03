package oopsPrograms;

public class StaticClass {
	static class InnerClass {
		void display() {
			System.out.println("Satatic class");
		}
	}

	public static void main(String[] args) {
		StaticClass.InnerClass obj = new StaticClass.InnerClass();
		obj.display();
	}
}

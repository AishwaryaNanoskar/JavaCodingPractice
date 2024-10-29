package oopsPrograms;

public class StaticMethod {

	static int i = 10, j = 20;

	static void run() {
		show(); // static methods can call only other static methods
		System.out.println(i); // Static methods can only access static variables
		// System.out.println(this.i); -- A static method cannot refer to this or super
		// keyword in anyway
	}

	static void show() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		StaticMethod st = new StaticMethod();
		// 1
		run(); // static methods can be call directly, there is no need to create a class object
				
		// 2
		StaticMethod.run(); // Static method can directly be called by class name
		
		Demo.calculate(); // Static methods belong to a class not objects
	}
}

class Demo {
	static void calculate() {
		System.out.println("This is a calculator");
	}
}

package oopsPrograms;

class ParentClass {

	int i = 40;

	void show(int i) {
		System.out.println(i);
	}
}

class MiddleClass extends ParentClass {
	int i = 80;

	void show(int i) {
		System.out.println(i);
	}
}

public class ChildClass extends MiddleClass {

	int i = 20;

	void show(int i) {
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.show(30);
	}
}

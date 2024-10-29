package oopsPrograms;

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car starts with key..");
	}

}

public class AbstractClass extends Vehicle {

	@Override
	void start() {
		System.out.println("Car starts with kick..");
	}

	public static void main(String[] args) {
		AbstractClass s = new AbstractClass();
		s.start();

		Car c = new Car();
		c.start();

	}

}

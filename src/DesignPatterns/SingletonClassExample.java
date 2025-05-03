package DesignPatterns;

class SingletonClass {

	private static volatile SingletonClass instance = null;

	private SingletonClass() {
		System.out.println("Singleton is initiated.");
	}

	public static SingletonClass checkSingletonClass() {
		if (instance == null) {
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();

				}
				return instance;
			}
		}
		return instance;

	}

	public static void doSomething() {
		System.out.println("Something is done.");
	}
}

public class SingletonClassExample {

	public static void main(String[] args) {
		SingletonClass.checkSingletonClass().doSomething();
	}
}

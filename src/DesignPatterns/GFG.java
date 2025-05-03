package DesignPatterns;

//Singleton class to ensure only one instance is created and globally accessible
//Thread Safe
class Singleton {

	// Static variable to hold the single instance of the Singleton class
	// 'volatile' ensures changes to this variable are visible to all threads
	private static volatile Singleton instance = null;

	// Private constructor to restrict instantiation of the class from outside
	private Singleton() {
		System.out.println("Singleton is initiated.");
	}

	/**
	 * Public static method to provide access to the single instance of the
	 * Singleton class. Uses double-checked locking to ensure thread safety and lazy
	 * initialization.
	 *
	 * @return the Singleton instance
	 */
	public static Singleton getInstance() {
		// First check: Avoid synchronization overhead if the instance is already
		// created
		if (instance == null) {
			// Synchronize on the Singleton class to prevent multiple threads from creating
			// instances
			synchronized (Singleton.class) {
				// Second check: Ensure only one instance is created when multiple threads
				// access this block
				if (instance == null) {
					instance = new Singleton();
				}
				return instance;
			}
		}
		// Return the existing instance if already created
		return instance;
	}

	/**
	 * A utility method to demonstrate functionality of the Singleton instance.
	 */
	public static void doSomething() {
		System.out.println("Something is done.");
	}
}

//Main class to test the Singleton implementation
public class GFG {
	public static void main(String[] args) {
		// Retrieve the Singleton instance and call its method
		Singleton.getInstance().doSomething();
	}
}

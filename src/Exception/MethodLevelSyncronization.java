package Exception;

class Counter {
	private static int count = 0;

	// Synchronized static method: Only one thread at a time can access this method
	// because its a synchronized method
	public static synchronized void increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
	}

	public static int getCount() {
		return count;
	}
}

public class MethodLevelSyncronization {
	public static void main(String[] args) {
		// Create threads
		Thread t1 = new Thread(() -> Counter.increment(), "Thread-1");
		Thread t2 = new Thread(() -> Counter.increment(), "Thread-2");

		t1.start();
		t2.start();
	}
}

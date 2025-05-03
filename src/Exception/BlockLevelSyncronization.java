package Exception;

public class BlockLevelSyncronization {
	private int count = 0;

	public void increment() {
		// Non-critical code
		System.out.println("Preparing to increment...");

		// Critical section
		synchronized (this) {
			count++;
			System.out.println("Count incremented to: " + count);
		}

		// Non-critical code
		System.out.println("Increment complete.");
	}

	public int getCount() {
		return count;
	}
}

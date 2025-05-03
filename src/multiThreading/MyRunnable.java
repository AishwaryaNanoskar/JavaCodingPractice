package multiThreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is getting executed...");
	}

	public static void main(String[] args) {
		MyRunnable run = new MyRunnable();
		Thread t = new Thread(run);
		t.start();

	}

}

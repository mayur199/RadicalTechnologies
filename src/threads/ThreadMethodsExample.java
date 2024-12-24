package threads;

public class ThreadMethodsExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("ThreadOne");
		MyThread t2 = new MyThread("ThreadTwo");

		// Setting priorities
		t1.setPriority(Thread.MAX_PRIORITY); // Highest priority
		t2.setPriority(Thread.MIN_PRIORITY); // Lowest priority

		// Starting the threads
		t1.start();
		t2.start();

		// Checking if threads are alive
		System.out.println(t1.getName() + " is alive: " + t1.isAlive());
		System.out.println(t2.getName() + " is alive: " + t2.isAlive());

		try {
			// Main thread waits for both threads to finish
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		// After completion, checking alive status again
		System.out.println(t1.getName() + " is alive after completion: " + t1.isAlive());
		System.out.println(t2.getName() + " is alive after completion: " + t2.isAlive());

		// Printing thread details
		System.out.println(t1.getName() + " ID: " + t1.getId() + ", Priority: " + t1.getPriority());
		System.out.println(t2.getName() + " ID: " + t2.getId() + ", Priority: " + t2.getPriority());

		System.out.println("Main thread execution completed.");
	}

}

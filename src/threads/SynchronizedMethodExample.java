package threads;

class SharedResource {
	private int count = 0;

	// Synchronized method to increment the count
	public synchronized void increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
	}
}

class MyThread1 extends Thread {
	private SharedResource resource;

	MyThread1(SharedResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			resource.increment();
		}
	}
}

public class SynchronizedMethodExample {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		MyThread1 t1 = new MyThread1(resource, "Thread-1");
		MyThread1 t2 = new MyThread1(resource, "Thread-2");

		t1.start();
		t2.start();
	}
}

package threads;

class SharedResource1 {
	private int count = 0;

	public void increment() {
		synchronized (this) {
			count++;
			System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
		}
	}
}

class MyThread2 extends Thread {
	private SharedResource1 resource;

	MyThread2(SharedResource1 resource, String name) {
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

public class SynchronizedBlockExample {
	public static void main(String[] args) {
		SharedResource1 resource = new SharedResource1();

		MyThread2 t1 = new MyThread2(resource, "Thread-1");
		MyThread2 t2 = new MyThread2(resource, "Thread-2");

		t1.start();
		t2.start();
	}
}

package threads;

class MyThread3 extends Thread {
	public MyThread3(String name) {
		super(name); 
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is starting.");
		try {
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has finished.");
	}
}

public class JoinExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread-One");
		MyThread t2 = new MyThread("Thread-Two");

		t1.start();
		t2.start();

		try {
			// Current thread (main) will wait for t1 and t2 to finish
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All threads have finished. Main thread exiting.");
	}
}

package threads;

class Task implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " started");

		try {
			// Thread ko 3 seconds ke liye sleep kara
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(threadName + " was interrupted");
		}

		System.out.println(threadName + " finished after sleeping for 3 seconds");
	}
}

public class ThreadSleepExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task(), "ThreadOne");
		Thread t2 = new Thread(new Task(), "ThreadTwo");

		t1.start();
		t2.start();

	}
}

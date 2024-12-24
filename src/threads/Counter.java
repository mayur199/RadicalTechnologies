package threads;

public class Counter extends Thread {

	private int count = 1;

	@Override
	public void run() {
		while (count <= 3) {
			System.out.println("---");
			System.out.println(Thread.currentThread().getName());
			System.out.println("Counter: " + count);
			System.out.println("---");
			++count;
		}
	}
}

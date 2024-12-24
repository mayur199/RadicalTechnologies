package threads;

public class CounterMain {

	public static void main(String[] args) {
//		Counter counter = new Counter();
//		Thread t1 = new Thread(counter, "ThreadOne");
//		Thread t2 = new Thread(counter, "ThreadTwo");

		Counter t1 = new Counter();
		Counter t2 = new Counter();
		t1.setName("ThreadOne");
		t2.setName("ThreadTwo");

		t1.start();
		t2.start();

		System.out.println("main thread spawned 2 child threads - done");
//		counter.run();

	}
}

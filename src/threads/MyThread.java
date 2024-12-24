package threads;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(getName() + " is starting.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interrupted.");
		}
		System.out.println(getName() + " has finished.");
	}
}
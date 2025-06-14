package collectionexample;

import java.util.ArrayList;
import java.util.List;

public class QueueUsingList {

	private List<String> queueList = new ArrayList<>();
    //Feature 1 implemented aaa
	public void enqueue(String item) {
		queueList.add(item);
		System.out.println(item + " added to the queue.");
	}

	public String dequeue() {
		if (queueList.isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		}
		String item = queueList.remove(0);
		System.out.println(item + " removed from the queue.");
		return item;
	}

	public String peek() {
		if (queueList.isEmpty()) {
			System.out.println("Queue is empty!");
			return null;
		}
		return queueList.get(0);
	}

	// Display the queue elements
	public void displayQueue() {
		if (queueList.isEmpty()) {
			System.out.println("Queue is empty!");
		} else {
			System.out.println("Queue: " + queueList);
		}
	}

	public static void main(String[] args) {
		QueueUsingList queue = new QueueUsingList();

		// Enqueue items
		queue.enqueue("Apple");
		queue.enqueue("Banana");
		queue.enqueue("Cherry");

		// Peek the first item
		System.out.println("Peek: " + queue.peek());

		// Dequeue items
		queue.dequeue();
		queue.dequeue();

		// Display remaining queue
		queue.displayQueue();
	}
}

package collectionexample;

import java.util.ArrayList;
import java.util.List;

import collections.Book;
import example.exceptionhandling.MyCustomException;

public class QueueExample {

	private List<Book> bookQueue = new ArrayList<>();

	public void enqueue(Book book) {
		bookQueue.add(book);
	}

	// Remove a book
	public Book dequeue() throws MyCustomException {
		if (bookQueue.isEmpty()) {
			throw new MyCustomException("Queue is empty");
		}
		return bookQueue.remove(0); // Removes the first element (FIFO)- remove karne ke liye index 0
	}

	public Book peek() throws MyCustomException {
		if (bookQueue.isEmpty()) {
			throw new MyCustomException("Queue is empty");
		}
		return bookQueue.get(0); // Returns the first element without removing it
	}

	// Display all books
	public void printQueue() throws MyCustomException {
		if (bookQueue.isEmpty()) {
			throw new MyCustomException("Queue is empty");
		}
		for (Book book : bookQueue) {
			System.out.println(book);
		}
	}

	public static void main(String[] args) {
		QueueExample myQueue = new QueueExample();

		myQueue.enqueue(new Book("Maths Fundamentals", "R D Sharma", "Maths"));
		myQueue.enqueue(new Book("Science Fundamentals", "Some Author", "Science"));
		myQueue.enqueue(new Book("Chemistry Fundamentals", "Another Author", "Chemistry"));

		try {
			System.out.println("Dequeue: " + myQueue.dequeue());
			System.out.println("Peek: " + myQueue.peek());
			myQueue.printQueue();
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
	}
}

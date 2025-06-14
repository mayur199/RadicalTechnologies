package collectionexample;

import java.util.ArrayList;
import java.util.List;
import collections.Book;
import example.exceptionhandling.MyCustomException;
// A simple Stack implementation using ArrayList
public class StackExample {

	private List<Book> bookStack = new ArrayList<>();

	public void push(Book book) {
		bookStack.add(book);
	}

	public Book pop() throws MyCustomException {
		if (bookStack.isEmpty()) {
			throw new MyCustomException("Stack is empty"); // Exception if stack is empty
		}
		return bookStack.remove(bookStack.size() - 1); // Remove and return the last added book (LIFO)
	}

	public Book peek() throws MyCustomException {
		if (bookStack.isEmpty()) {
			throw new MyCustomException("Stack is empty"); // Exception if stack is empty
		}
		return bookStack.get(bookStack.size() - 1); // Return the last book without removing it
	}

	// Display all books
	public void printStack() throws MyCustomException {
		if (bookStack.isEmpty()) {
			throw new MyCustomException("Stack is empty"); // Exception if stack is empty
		}
		for (Book book : bookStack) {
			System.out.println(book); // Print each book in the stack
		}
	}

	public static void main(String[] args) {
		StackExample myStack = new StackExample();

		myStack.push(new Book("Java Fundamentals", "Author A", "Programming"));
		myStack.push(new Book("Data Structures", "Author B", "Computer Science"));
		myStack.push(new Book("Algorithms", "Author C", "Computer Science"));

		try {
			System.out.println("Peek: " + myStack.peek());
			System.out.println("Popped: " + myStack.pop());
			System.out.println("Popped: " + myStack.pop());
			System.out.println("Books in Stack:");
			myStack.printStack();
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
	}
}

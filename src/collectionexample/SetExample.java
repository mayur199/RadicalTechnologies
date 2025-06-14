package collectionexample;

import java.util.ArrayList;
import java.util.List;

import collections.Book;
import example.exceptionhandling.MyCustomException;

// A simple Set implementation using ArrayList
public class SetExample {

	private List<Book> bookSet = new ArrayList<>();

	// Add a book
	public void addBook(Book book) {
		if (!bookSet.contains(book)) {
			bookSet.add(book);
		} else {
			System.out.println("Duplicate Book: " + book);
		}
	}

	// Remove a book
	public void removeBook(Book book) throws MyCustomException {
		if (!bookSet.remove(book)) {
			throw new MyCustomException("Book not found in Set");
		}
	}

	// Display all books
	public void printSet() throws MyCustomException {
		if (bookSet.isEmpty()) {
			throw new MyCustomException("Set is empty");
		}
		for (Book book : bookSet) {
			System.out.println(book);
		}
	}

	public static void main(String[] args) {
		SetExample mySet = new SetExample();

		mySet.addBook(new Book("Maths Fundamentals", "R D Sharma", "Maths"));
		mySet.addBook(new Book("Science Fundamentals", "Some Author", "Science"));
		mySet.addBook(new Book("Chemistry Fundamentals", "Another Author", "Chemistry"));
		mySet.addBook(new Book("Maths Fundamentals", "R D Sharma", "Maths")); // Duplicate

		try {
			mySet.printSet();
			mySet.removeBook(new Book("Maths Fundamentals", "R D Sharma", "Maths"));
			System.out.println("After removal:");
			mySet.printSet();
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
	}
}

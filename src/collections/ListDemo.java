package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import example.exceptionhandling.MyCustomException;

public class ListDemo {
//test3
//	private List<Book> library = new ArrayList<Book>();
	private List<Book> library = new LinkedList<Book>();

//	private List<Integer> listOfNumber = new ArrayList<Integer>();

	public void addBookToLibrary(String name, String author, String subject) {
		library.add(new Book(name, author, subject));
	}

	public void addBookToLibrary(String name, String author, String subject, int index) {
		library.set(index, new Book(name, author, subject));
	}

	public Book getBookFromLibrary(int index) throws MyCustomException {
		if (library.isEmpty()) {
			throw new MyCustomException("Library has no books");
		}
		if (index > library.size()) {
			throw new MyCustomException("Book doesn't exist");
		}
		return library.get(index);
	}

	public int getBooksCount() {
		return library.size();
	}

	public void removeBookFromLibrary(int index) throws MyCustomException {
		if (library.isEmpty()) {
			throw new MyCustomException("Library has no books");
		}
		library.remove(index);
	}

	public void displayAllBooks() {
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
	}

//	public boolean isBookAvailable(Book book) {
//		 write the Logic
//		for (Book b : library) {
//			if (b.getName().equals(book.getName()) && b.getAuthor().equals(book.getAuthor())
//					&& b.getSubject().equals(book.getSubject())) {
//				return true; 
//			}
//		}
//		return false; 
//		List <Integer> integer = new ArrayList();
//		for(int i=1 ; i<10; i++) {
//			integer.add(i);
//		}
//		System.out.println(integer.contains(1));
//		System.out.println(integer.contains(11));
//
//		return library.contains(book);
//	}

	public boolean isBookAvailable(Book book) {
		return library.contains(book);
	}

	public void arrangeAllBooks() {
		Collections.sort(library);
	}

	public void sortBooksByAuthor() {
		library.sort(new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				return b2.getAuthor().compareTo(b1.getAuthor());
			}

		});
	}
}

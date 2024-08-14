package presentation;

import java.util.Collection;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;
	
public class Presentation {
	BookService bookService;
	
	public Presentation() {
		bookService = new BookServiceImpl();
	}

	public void present() {
		// display the menu
		System.out.println("1. Fetch all Books");
		System.out.println("2. Fetch A Book");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the option:");
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			Collection<BookPojo> allBooks = bookService.fetchAllBooks();
			allBooks.forEach((eachBook) -> System.out.println(eachBook));
			break;
		case 2:
			System.out.println("Enter book id to fetch a book : ");
			int bookId = scan.nextInt();
			BookPojo fetchedBook = bookService.fetchABook(bookId);
			if(fetchedBook == null) {
				System.out.println("Sorry! Book with ID : " + bookId + " does not exist!");
			}else {
				System.out.println("Fetched Book : " + fetchedBook);
			}
			break;
		default:
			
		}
	}
}

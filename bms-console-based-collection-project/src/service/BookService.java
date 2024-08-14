package service;

import java.util.Collection;

import pojo.BookPojo;

public interface BookService {
	Collection<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
}

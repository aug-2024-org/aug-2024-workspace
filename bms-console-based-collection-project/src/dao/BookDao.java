package dao;

import java.util.Collection;

import pojo.BookPojo;

public interface BookDao {
	Collection<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
}

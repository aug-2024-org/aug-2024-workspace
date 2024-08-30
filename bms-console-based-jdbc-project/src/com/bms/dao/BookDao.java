package com.bms.dao;

import java.util.List;

import com.bms.model.BookPojo;

public interface BookDao {
	List<BookPojo> fetchAllBooksOnly();
	List<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
}

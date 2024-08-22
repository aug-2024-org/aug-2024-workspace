package com.bms.dao;

import java.util.List;

import com.bms.pojo.BookPojo;

public interface BookDao {
	List<BookPojo> fetchAllBooks();
	List<BookPojo> fetchAllBooksByGenre(String genre);
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
	
}

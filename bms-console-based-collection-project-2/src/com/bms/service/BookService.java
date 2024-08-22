package com.bms.service;

import java.util.List;

import com.bms.exception.BookEmptyException;
import com.bms.exception.BookNotFoundException;
import com.bms.pojo.BookPojo;

public interface BookService {
	List<BookPojo> fetchAllBooks()throws BookEmptyException ;
	List<BookPojo> fetchAllBooksByGenre(String genre)throws BookEmptyException;
	BookPojo fetchABook(int bookId)throws BookNotFoundException;
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
}

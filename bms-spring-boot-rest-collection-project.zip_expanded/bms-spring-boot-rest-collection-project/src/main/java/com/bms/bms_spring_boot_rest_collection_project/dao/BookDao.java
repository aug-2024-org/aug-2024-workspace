package com.bms.bms_spring_boot_rest_collection_project.dao;

import java.util.Collection;
import java.util.List;

import com.bms.bms_spring_boot_rest_collection_project.pojo.BookPojo;

public interface BookDao {
	Collection<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
	List<BookPojo> fetchBooksByGenre(String genre);
}

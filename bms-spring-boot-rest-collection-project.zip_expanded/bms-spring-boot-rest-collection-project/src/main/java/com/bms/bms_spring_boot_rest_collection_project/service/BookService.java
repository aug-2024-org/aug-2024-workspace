package com.bms.bms_spring_boot_rest_collection_project.service;

import java.util.Collection;

import com.bms.bms_spring_boot_rest_collection_project.pojo.BookPojo;

public interface BookService {
	Collection<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
}

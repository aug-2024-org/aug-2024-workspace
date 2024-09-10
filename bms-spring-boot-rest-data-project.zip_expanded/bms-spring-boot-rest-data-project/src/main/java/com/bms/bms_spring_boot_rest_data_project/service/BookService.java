package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.List;

import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

public interface BookService {
	List<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	List<BookPojo> fetchByBookGenre(String bookGenre);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int bookId);
}

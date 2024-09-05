package com.bms.bms_spring_boot_rest_collection_project.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms_spring_boot_rest_collection_project.pojo.BookPojo;
import com.bms.bms_spring_boot_rest_collection_project.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// here write the request handler methods
	
	// fetchAllBooks
	// GET http://localhost:8787/api/books
	@GetMapping("/books")
//	public Collection<BookPojo> fetchAllBooks(){
	public ResponseEntity<Collection<BookPojo>> fetchAllBooks(){
		Collection<BookPojo> allBooks = bookService.fetchAllBooks();
		return new ResponseEntity<Collection<BookPojo>>(allBooks, HttpStatus.OK);
	}
	
	// fetchABook
	// GET http://localhost:8787/api/books/102
	@GetMapping("/books/{bid}")
	public ResponseEntity<BookPojo> fetchABook(@PathVariable("bid") int bookId) {
		BookPojo fetchedBook = bookService.fetchABook(bookId);
		return new ResponseEntity<BookPojo>(fetchedBook, HttpStatus.OK);
	}
	
	// addBook
	
	// updateBook
	
	// deleteBook
	// GET http://localhost:8787/api/books/102
	@DeleteMapping("/books/{bid}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bid") int bookId) {
		bookService.deleteBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

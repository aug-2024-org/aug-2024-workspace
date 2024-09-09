package com.bms.bms_spring_boot_rest_collection_project.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms_spring_boot_rest_collection_project.pojo.BookPojo;
import com.bms.bms_spring_boot_rest_collection_project.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// here write the request handler methods/ endpoint methods
	
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
	
	// fetchBooksByGenre
	// GET http://localhost:8787/api/books/genre/fantasy
	@GetMapping("/books/genre/{gen}")
	public ResponseEntity<Collection<BookPojo>> fetchBooksByGenre(@PathVariable("gen") String genre){
		List<BookPojo> allBooks = bookService.fetchBooksByGenre(genre);
		return new ResponseEntity<Collection<BookPojo>>(allBooks, HttpStatus.OK);
	}
	
	// addBook
	@PostMapping("/books")
	public ResponseEntity<BookPojo> addBook(@RequestBody BookPojo newBook){
		BookPojo returnedBook = bookService.addBook(newBook);
		return new ResponseEntity<BookPojo>(returnedBook, HttpStatus.CREATED);
	}
	
	// updateBook
	@PutMapping("/books")
	public ResponseEntity<BookPojo> updateBook(@RequestBody BookPojo updateBook){
		BookPojo returnedBook = bookService.updateBook(updateBook);
		return new ResponseEntity<BookPojo>(returnedBook, HttpStatus.OK);
	}
	
	// deleteBook
	// DELETE http://localhost:8787/api/books/102
	@DeleteMapping("/books/{bid}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bid") int bookId) {
		bookService.deleteBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

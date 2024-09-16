package com.bms.bms_spring_boot_rest_data_project.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;
import com.bms.bms_spring_boot_rest_data_project.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<Collection<BookPojo>> fetchAllBooks(){
		Collection<BookPojo> allBooks = bookService.fetchAllBooks();
		return new ResponseEntity<Collection<BookPojo>>(allBooks, HttpStatus.OK);
	}
	
	@GetMapping("/books/{bid}")
	@PreAuthorize("hasRole('ROLE_USER')")
	public ResponseEntity<BookPojo> fetchABook(@PathVariable("bid") int bookId) {
		BookPojo fetchedBook = bookService.fetchABook(bookId);
		return new ResponseEntity<BookPojo>(fetchedBook, HttpStatus.OK);
	}
	
	@GetMapping("/books/genre/{genre}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<List<BookPojo>> fetchBookByGenre(@PathVariable("genre") String bookGenre) {
		List<BookPojo> allFetchedBook = bookService.fetchByBookGenre(bookGenre);
		return new ResponseEntity<List<BookPojo>>(allFetchedBook, HttpStatus.OK);
	}
	
	@PostMapping("/books")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<BookPojo> addBook(@Valid @RequestBody BookPojo newBook){
		BookPojo returnedBook = bookService.addBook(newBook);
		return new ResponseEntity<BookPojo>(returnedBook, HttpStatus.CREATED);
	}
	
	@PutMapping("/books")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<BookPojo> updateBook(@RequestBody BookPojo updateBook){
		BookPojo returnedBook = bookService.updateBook(updateBook);
		return new ResponseEntity<BookPojo>(returnedBook, HttpStatus.OK);
	}
	
	@DeleteMapping("/books/{bid}")
	@PreAuthorize("hasRole(ROLE_ADMIN)")
	public ResponseEntity<Void> deleteBook(@PathVariable("bid") int bookId) {
		bookService.deleteBook(bookId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}

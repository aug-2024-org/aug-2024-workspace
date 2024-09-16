package com.bms.bms_spring_boot_rest_data_project.controller;

import java.util.Collection;

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

import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;
import com.bms.bms_spring_boot_rest_data_project.service.BookServiceImpl2;

@RestController
@RequestMapping("/api/v2")
public class BookController2 {

	@Autowired
	BookServiceImpl2 bookService;
	
	@GetMapping("/books")
	public ResponseEntity<Collection<BookEntity>> fetchAllBooks(){
		Collection<BookEntity> allBooks = bookService.fetchAllBooks();
		return new ResponseEntity<Collection<BookEntity>>(allBooks, HttpStatus.OK);
	}
	
	@GetMapping("/books/{bid}")
	public ResponseEntity<BookEntity> fetchABook(@PathVariable("bid") int bookId) {
		BookEntity fetchedBook = bookService.fetchABook(bookId);
		return new ResponseEntity<BookEntity>(fetchedBook, HttpStatus.OK);
	}
	
}

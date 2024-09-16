package com.bms.bms_spring_boot_rest_data_project.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;
import com.bms.bms_spring_boot_rest_data_project.service.AuthorService;

@RestController
@RequestMapping("/api")
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
	// fetchAllAuthors
	// GET http://localhost:8787/api/authors
	@GetMapping("/authors")
	public ResponseEntity<Collection<AuthorPojo>> fetchAllAuthors(){
		Collection<AuthorPojo> allAuthors = authorService.fetchAllAuthors();
		return new ResponseEntity<Collection<AuthorPojo>>(allAuthors, HttpStatus.OK);
	}
	
	// fetchAAuthor
	// GET http://localhost:8787/api/authors/102
	@GetMapping("/authors/{aid}")
	public ResponseEntity<AuthorPojo> fetchAAuthor(@PathVariable("aid") int authorId) {
		AuthorPojo fetchedAuthor = authorService.fetchAAuthor(authorId);
		return new ResponseEntity<AuthorPojo>(fetchedAuthor, HttpStatus.OK);
	}
	
	// addAuthor
	@PostMapping("/authors")
	public ResponseEntity<AuthorPojo> addAuthor(@RequestBody AuthorPojo newAuthor){
		AuthorPojo returnedAuthor = authorService.addAuthor(newAuthor);
		return new ResponseEntity<AuthorPojo>(returnedAuthor, HttpStatus.CREATED);
	}
	
	// updateAuthor
	@PutMapping("/authors")
	public ResponseEntity<AuthorPojo> updateAuthor(@RequestBody AuthorPojo updateAuthor){
		AuthorPojo returnedAuthor = authorService.updateAuthor(updateAuthor);
		return new ResponseEntity<AuthorPojo>(returnedAuthor, HttpStatus.OK);
	}
	
	// updateAuthor
	@PatchMapping("/authors/{aid}")
	public ResponseEntity<AuthorPojo> patchAuthor(@PathVariable("aid") int authorId, @RequestBody Map<String, Object> updateFieldsAuthor){
		AuthorPojo returnedAuthor = authorService.patchAuthor(authorId, updateFieldsAuthor);
		return new ResponseEntity<AuthorPojo>(returnedAuthor, HttpStatus.OK);
	}
	
	// deleteAuthor
	// DELETE http://localhost:8787/api/books/102
	@DeleteMapping("/authors/{aid}")
	public ResponseEntity<Void> deleteAuthor(@PathVariable("aid") int authorId) {
		authorService.deleteAuthor(authorId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	
}

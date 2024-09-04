package com.demo.spring_boot_mvc_collection_demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.spring_boot_mvc_collection_demo.model.BookPojo;

@Controller
@RequestMapping("api")
public class BookController {

	@GetMapping("/books")
	public String fetchAllBooks(Model model) {
		// lets create a collection of bookpojo 
		List<BookPojo> allBooks = Arrays.asList(
				new BookPojo(101, "Harry Potter and the Order of Phoenix", "J.K.Rowling", 550, "Fantasy", ""),
				new BookPojo(102, "Harry Potter and the Half Blood Prince", "J.K.Rowling", 450, "Fantasy", ""),
				new BookPojo(103, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", 350, "Fantasy", "")
				);
				
		//and put it in the model
		model.addAttribute("books", allBooks);
		
		// return the view name
		return "booklist";
	}
}

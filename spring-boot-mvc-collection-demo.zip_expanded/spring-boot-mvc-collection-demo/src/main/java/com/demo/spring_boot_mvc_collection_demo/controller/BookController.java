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
				new BookPojo(101, "Harry Potter and the Order of Phoenix", "J.K.Rowling", 550, "Fantasy", "https://cdn.pixabay.com/photo/2018/04/04/21/50/harry-potter-3291236_1280.jpg"),
				new BookPojo(102, "Harry Potter and the Half Blood Prince", "J.K.Rowling", 450, "Fantasy", "https://cdn.pixabay.com/photo/2015/05/31/14/20/books-791923_1280.jpg"),
				new BookPojo(103, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", 350, "Fantasy", "https://cdn.pixabay.com/photo/2014/09/05/18/32/old-books-436498_1280.jpg")
				);
				
		//and put it in the model
		model.addAttribute("books", allBooks);
		
		// return the view name
		return "bookList";
	}
}

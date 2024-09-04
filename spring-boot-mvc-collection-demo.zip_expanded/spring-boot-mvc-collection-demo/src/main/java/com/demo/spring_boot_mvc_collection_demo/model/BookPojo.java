package com.demo.spring_boot_mvc_collection_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookGenre;
	private String bookImageUrl;
	
}

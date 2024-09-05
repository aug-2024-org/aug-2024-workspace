package com.bms.bms_spring_boot_rest_collection_project.pojo;

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

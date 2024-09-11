package com.bms.bms_spring_boot_rest_data_project.pojo;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookPojo {
	
	private int bookId;
	
	@NotNull(message = "Book Title is required")
	@Size(min=3, max=50, message="Book Title's length should be between 3 and 50")
	private String bookTitle;
	
	@NotNull(message = "Book Genre cannot be null")
	private String bookGenre;
	private AuthorPojo authorPojo;
	
	@NotNull(message = "Book Price cannot be null")
	private int bookPrice;
	
	@NotNull(message = "Book Published cannot be null")
	@Past(message = "Book Published should be in the past")
	private LocalDate bookPublished;
	private String bookImageUrl;
	private List<CharacterPojo> allCharactersPojo;
	
	public BookPojo(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	
}

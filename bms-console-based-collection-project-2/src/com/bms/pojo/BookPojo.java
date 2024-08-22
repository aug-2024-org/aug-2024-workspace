package com.bms.pojo;

import java.time.LocalDate;
import java.util.List;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private AuthorPojo author;
	private String bookGenre;
	private LocalDate bookPublished; 
	private int bookPrice;
	private List<CharacterPojo> characters;
	private String bookImageUrl;
	
	public BookPojo(int bookId, String bookTitle, AuthorPojo author, String bookGenre, LocalDate bookPublished,
			int bookPrice, List<CharacterPojo> characters, String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookGenre = bookGenre;
		this.bookPublished = bookPublished;
		this.bookPrice = bookPrice;
		this.characters = characters;
		this.bookImageUrl = bookImageUrl;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public AuthorPojo getAuthor() {
		return author;
	}

	public void setAuthor(AuthorPojo author) {
		this.author = author;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public LocalDate getBookPublished() {
		return bookPublished;
	}

	public void setBookPublished(LocalDate bookPublished) {
		this.bookPublished = bookPublished;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public List<CharacterPojo> getCharacters() {
		return characters;
	}

	public void setCharacters(List<CharacterPojo> characters) {
		this.characters = characters;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", bookGenre="
				+ bookGenre + ", bookPublished=" + bookPublished + ", bookPrice=" + bookPrice + ", characters="
				+ characters + ", bookImageUrl=" + bookImageUrl + "]";
	}
	
}

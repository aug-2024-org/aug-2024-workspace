package com.bms.pojo;

import java.time.LocalDate;
import java.util.List;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private AuthorPojo author;
	private String bookGenre;
	private LocalDate bookPublished;
	private String bookImageUrl; 
	private List<CharacterPojo> characters;
	
	public BookPojo(int bookId, String bookTitle, AuthorPojo author, String bookGenre, LocalDate bookPublished,
			String bookImageUrl, List<CharacterPojo> characters) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.bookGenre = bookGenre;
		this.bookPublished = bookPublished;
		this.bookImageUrl = bookImageUrl;
		this.characters = characters;
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

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	public List<CharacterPojo> getCharacters() {
		return characters;
	}

	public void setCharacters(List<CharacterPojo> characters) {
		this.characters = characters;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", bookGenre="
				+ bookGenre + ", bookPublished=" + bookPublished + ", bookImageUrl=" + bookImageUrl + ", characters="
				+ characters + "]";
	}
}

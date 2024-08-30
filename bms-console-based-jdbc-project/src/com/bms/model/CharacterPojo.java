package com.bms.model;

import java.util.List;

public class CharacterPojo {
	private int charId;
	private String charFirstname;
	private String charLastname;
	private String charImageUrl;
	private List<BookPojo> books;
	
	public CharacterPojo(int charId, String charFirstname, String charLastname, String charImageUrl) {
		super();
		this.charId = charId;
		this.charFirstname = charFirstname;
		this.charLastname = charLastname;
		this.charImageUrl = charImageUrl;
	}

	public CharacterPojo(int charId, String charFirstname, String charLastname, String charImageUrl,
			List<BookPojo> books) {
		super();
		this.charId = charId;
		this.charFirstname = charFirstname;
		this.charLastname = charLastname;
		this.charImageUrl = charImageUrl;
		this.books = books;
	}

	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getCharFirstname() {
		return charFirstname;
	}

	public void setCharFirstname(String charFirstname) {
		this.charFirstname = charFirstname;
	}

	public String getCharLastname() {
		return charLastname;
	}

	public void setCharLastname(String charLastname) {
		this.charLastname = charLastname;
	}

	public String getCharImageUrl() {
		return charImageUrl;
	}

	public void setCharImageUrl(String charImageUrl) {
		this.charImageUrl = charImageUrl;
	}

	public List<BookPojo> getBooks() {
		return books;
	}

	public void setBooks(List<BookPojo> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "CharacterPojo [charId=" + charId + ", charFirstname=" + charFirstname + ", charLastname=" + charLastname
				+ ", charImageUrl=" + charImageUrl + ", books=" + books + "]";
	}
}

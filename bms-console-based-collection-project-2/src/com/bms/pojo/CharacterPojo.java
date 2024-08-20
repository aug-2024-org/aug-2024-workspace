package com.bms.pojo;

import java.util.List;

public class CharacterPojo {
	private int charId;
	private String charFirstname;
	private String charLastname;
	private List<BookPojo> books;
	
	public CharacterPojo(int charId, String charFirstname, String charLastname, List<BookPojo> books) {
		super();
		this.charId = charId;
		this.charFirstname = charFirstname;
		this.charLastname = charLastname;
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

	public List<BookPojo> getBooks() {
		return books;
	}

	public void setBooks(List<BookPojo> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "CharacterPojo [charId=" + charId + ", charFirstname=" + charFirstname + ", charLastname=" + charLastname
				+ ", books=" + books + "]";
	}
}

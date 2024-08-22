package com.bms.exception;

public class BookEmptyException extends Exception{

	@Override
	public String getMessage() {
		return "Book Store is Empty!";
	}
	
}

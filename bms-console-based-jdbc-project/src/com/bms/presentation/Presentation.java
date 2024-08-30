package com.bms.presentation;

import java.util.List;

import com.bms.dao.AuthorDao;
import com.bms.dao.AuthorDaoJdbcImpl;
import com.bms.dao.BookDao;
import com.bms.dao.BookDaoJdbcImpl;
import com.bms.model.AuthorPojo;
import com.bms.model.BookPojo;
import com.bms.model.CharacterPojo;
public class Presentation {
	public static void start() {
		BookDao bookDao = new BookDaoJdbcImpl();
		AuthorDao authorDao = new AuthorDaoJdbcImpl();
		
		List<BookPojo> allBooksOnly = bookDao.fetchAllBooksOnly(); 
		for(BookPojo eachBook: allBooksOnly) {
			System.out.println("Book ID:" + eachBook.getBookId());
			System.out.println("Book Title:" + eachBook.getBookTitle());
			System.out.println("Book Genre:" + eachBook.getBookGenre());
			System.out.println("Book Author ID:" + eachBook.getAuthor().getAuthorId());
			System.out.println("-----------------");

		}
		System.out.println("===========================");

		List<BookPojo> allBooks = bookDao.fetchAllBooks(); 
		for(BookPojo eachBook: allBooks) {
			System.out.println("Book ID:" + eachBook.getBookId());
			System.out.println("Book Title:" + eachBook.getBookTitle());
			System.out.println("Book Genre:" + eachBook.getBookGenre());
			System.out.println("Book Author ID:" + eachBook.getAuthor().getAuthorId());
			System.out.println("Book Author First name:" + eachBook.getAuthor().getAuthorFirstname());
			System.out.println("Character List : ");
			for(CharacterPojo eachChar: eachBook.getCharacters()) {
				System.out.println(eachChar);
			}
			System.out.println("-----------------");			
		}
		System.out.println("=======================");
		System.out.println(authorDao.addAuthor(new AuthorPojo(0, "TESTING", "TESTING", "TESTING")));
	}
}

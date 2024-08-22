package com.bms.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bms.pojo.AuthorPojo;
import com.bms.pojo.BookPojo;

public class BookDaoCollectionImpl implements BookDao{

	static List<BookPojo> bookDataStore;
	
	static {
		bookDataStore = new ArrayList<>();
		BookPojo book1 = new BookPojo(101, "Harry Potter and the Order of Phoenix", new AuthorPojo(501, "Rowling", "J.K", ""), "Fantasy", LocalDate.of(2021, 10, 10), 550, null, "");
		BookPojo book2 = new BookPojo(102, "Harry Potter and the Chamber of Secrets", new AuthorPojo(501, "Rowling", "J.K", ""), "Fantasy", LocalDate.of(2022, 12, 12), 450, null, "");
		BookPojo book3 = new BookPojo(103, "Harry Potter and the Half Blood Prince", new AuthorPojo(501, "Rowling", "J.K", ""), "Fantasy", LocalDate.of(2024, 8, 9), 350, null, "");
		
		bookDataStore.add(book1);
		bookDataStore.add(book2);
		bookDataStore.add(book3);
	}
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDataStore;
	}

	@Override
	public List<BookPojo> fetchAllBooksByGenre(String genre) {
		return bookDataStore.stream()
								.filter((eachBook) -> eachBook.getBookGenre().equals(genre))
								.collect(Collectors.toList());
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookPojo fetchedBook = null;
		List<BookPojo> fetchedBookList = bookDataStore.stream()
													.filter((eachBook) -> eachBook.getBookId() == bookId)
													.collect(Collectors.toList());
		if(fetchedBookList.size() != 0) {
			fetchedBook = fetchedBookList.get(0);
		}
		return fetchedBook;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}

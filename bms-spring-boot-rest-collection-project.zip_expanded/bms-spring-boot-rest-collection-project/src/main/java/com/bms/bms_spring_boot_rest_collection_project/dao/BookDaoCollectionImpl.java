package com.bms.bms_spring_boot_rest_collection_project.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.bms.bms_spring_boot_rest_collection_project.pojo.BookPojo;

@Repository
public class BookDaoCollectionImpl implements BookDao{
	
	Map<Integer, BookPojo> bookDataStore;

	public BookDaoCollectionImpl() {
		bookDataStore = new HashMap<Integer, BookPojo>();
		BookPojo book1 = new BookPojo(101, "Harry Potter and the Order of Phoenix", "J.K.Rowling", 550, "Fantasy", "");
		BookPojo book2 = new BookPojo(102, "Harry Potter and the Half Blood Prince", "J.K.Rowling", 450, "Fantasy", "");
		BookPojo book3 = new BookPojo(103, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", 350, "Fantasy", "");
		bookDataStore.put(book1.getBookId(), book1);
		bookDataStore.put(book2.getBookId(), book2);
		bookDataStore.put(book3.getBookId(), book3);
	}

	@Override
	public Collection<BookPojo> fetchAllBooks() {
		return bookDataStore.values();
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDataStore.get(bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		Collection<BookPojo> allBooks = bookDataStore.values();
		int newBookId = allBooks.stream().max((o1, o2) -> o1.getBookId() - o2.getBookId()).get().getBookId() + 1;
		newBook.setBookId(newBookId);
		bookDataStore.put(newBook.getBookId(), newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		bookDataStore.replace(updateBook.getBookId(), updateBook);
		return bookDataStore.get(updateBook.getBookId());
	}

	@Override
	public void deleteBook(int bookId) {
		bookDataStore.remove(bookId);
	}

	@Override
	public List<BookPojo> fetchBooksByGenre(String genre) {
		List<BookPojo> returnedList = new ArrayList<>();
		Set<Integer> allKeys = bookDataStore.keySet();
		for(Integer eachKey: allKeys) {
			BookPojo book = bookDataStore.get(eachKey);
			if(book.getBookGenre().equals(genre)) {
				returnedList.add(book);
			}
		}
		return returnedList;
	}

}
 
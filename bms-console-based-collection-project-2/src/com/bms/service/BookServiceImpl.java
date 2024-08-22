package com.bms.service;

import java.util.List;

import com.bms.dao.BookDao;
import com.bms.dao.BookDaoCollectionImpl;
import com.bms.exception.BookEmptyException;
import com.bms.exception.BookNotFoundException;
import com.bms.pojo.BookPojo;

public class BookServiceImpl implements BookService{

	BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao = new BookDaoCollectionImpl();
	}
	
	@Override
	public List<BookPojo> fetchAllBooks()throws BookEmptyException {
		List<BookPojo> allBooks = bookDao.fetchAllBooks();
		if(allBooks.isEmpty()) {
			throw new BookEmptyException();
		}
		return allBooks;
	}

	@Override
	public List<BookPojo> fetchAllBooksByGenre(String genre) throws BookEmptyException{
		List<BookPojo> allBooks = bookDao.fetchAllBooksByGenre(genre);
		if(allBooks.isEmpty()) {
			throw new BookEmptyException();
		}
		return allBooks;
	}

	@Override
	public BookPojo fetchABook(int bookId) throws BookNotFoundException{
		BookPojo fetchedBook = bookDao.fetchABook(bookId);
		if(fetchedBook == null) {
			throw new BookNotFoundException(bookId);
		}
		return fetchedBook;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}

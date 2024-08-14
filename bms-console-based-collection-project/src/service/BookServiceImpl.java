package service;

import java.util.Collection;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import pojo.BookPojo;

public class BookServiceImpl implements BookService{

	BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao = new BookDaoCollectionImpl();
	}

	@Override
	public Collection<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return bookDao.updateBook(updateBook);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}
}

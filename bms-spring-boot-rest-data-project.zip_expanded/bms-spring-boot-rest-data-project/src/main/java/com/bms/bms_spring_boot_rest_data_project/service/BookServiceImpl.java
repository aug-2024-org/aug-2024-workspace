package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bms_spring_boot_rest_data_project.dao.BookDao;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.AuthorEntity;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		List<BookEntity> allBooksEntity = bookDao.findAll();
		
		List<BookPojo> allBooksPojo = new ArrayList<>();
		for(BookEntity eachBookEntity: allBooksEntity) {
			BookPojo bookPojo = new BookPojo();
			BeanUtils.copyProperties(eachBookEntity, bookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthorEntity(), authorPojo);
			bookPojo.setAuthorPojo(authorPojo);
			allBooksPojo.add(bookPojo);
		}
		return allBooksPojo;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		Optional<BookEntity> optionalBookEntity = bookDao.findById(bookId);
		if(optionalBookEntity.isPresent()) {
			BookPojo bookPojo = new BookPojo();
			BeanUtils.copyProperties(optionalBookEntity.get(), bookPojo);
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(optionalBookEntity.get().getAuthorEntity(), authorPojo);
			bookPojo.setAuthorPojo(authorPojo);
			return bookPojo;
		}
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(newBook, bookEntity);
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newBook.getAuthorPojo(), authorEntity);
		bookEntity.setAuthorEntity(authorEntity);
		bookDao.saveAndFlush(bookEntity);
		newBook.setBookId(bookEntity.getBookId());
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {		
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(editBook, bookEntity);
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(editBook.getAuthorPojo(), authorEntity);
		bookEntity.setAuthorEntity(authorEntity);
		bookDao.saveAndFlush(bookEntity);
		return editBook;	
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteById(bookId);
	}

}

package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bms_spring_boot_rest_data_project.dao.BookDao;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

@Service
public class BookServiceImpl2{
	@Autowired
	BookDao bookDao;
	
	public List<BookEntity> fetchAllBooks() {
		return bookDao.findAll();
	}

	public BookEntity fetchABook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public BookEntity addBook(BookEntity newBook) {
		return bookDao.saveAndFlush(newBook);
	}

	public BookEntity updateBook(BookEntity editBook) {
		return bookDao.saveAndFlush(editBook);
	}
	
	public void deleteBook(int bookId) {
		bookDao.deleteById(bookId);
	}

}

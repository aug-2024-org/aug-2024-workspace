package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.bms.bms_spring_boot_rest_data_project.dao.BookDao;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.AuthorEntity;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.CharacterEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;
import com.bms.bms_spring_boot_rest_data_project.pojo.CharacterPojo;

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
			
			// copy nested author info
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachBookEntity.getAuthorEntity(), authorPojo);
			bookPojo.setAuthorPojo(authorPojo);
			
			// copy nested collection of charcaters
			List<CharacterPojo> allCharactersPojo = new ArrayList<>();
			for(CharacterEntity eachCharEntity: eachBookEntity.getAllCharactersEntity()) {
				CharacterPojo charPojo = new CharacterPojo();
				BeanUtils.copyProperties(eachCharEntity, charPojo);
				allCharactersPojo.add(charPojo);
			}
			bookPojo.setAllCharactersPojo(allCharactersPojo);
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
			List<CharacterPojo> allCharactersPojo = new ArrayList<>();
			for(CharacterEntity eachCharEntity: optionalBookEntity.get().getAllCharactersEntity()) {
				CharacterPojo charPojo = new CharacterPojo();
				BeanUtils.copyProperties(eachCharEntity, charPojo);
				allCharactersPojo.add(charPojo);
			}
			bookPojo.setAllCharactersPojo(allCharactersPojo);
			return bookPojo;
		}
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		BookEntity bookEntity = new BookEntity();
		BeanUtils.copyProperties(newBook, bookEntity);
		
		//copy nested author info
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newBook.getAuthorPojo(), authorEntity);
		bookEntity.setAuthorEntity(authorEntity);
		
		// copy nested coll of character info
		List<CharacterEntity> allCharsEntity = new ArrayList<CharacterEntity>();
		for(CharacterPojo eachCharacterPojo: newBook.getAllCharactersPojo()) {
			CharacterEntity characterEntity = new CharacterEntity();
			BeanUtils.copyProperties(eachCharacterPojo, characterEntity);
			allCharsEntity.add(characterEntity);
		}
		bookEntity.setAllCharactersEntity(allCharsEntity);
		
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

	@Override
	public List<BookPojo> fetchByBookGenre(String bookGenre) {
		return bookDao.findByBookGenre(bookGenre);
	}

}

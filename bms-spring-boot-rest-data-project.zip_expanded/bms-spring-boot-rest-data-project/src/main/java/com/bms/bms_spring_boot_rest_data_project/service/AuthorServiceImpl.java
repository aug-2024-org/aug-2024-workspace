package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bms_spring_boot_rest_data_project.dao.AuthorDao;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.AuthorEntity;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorDao authorDao;
	
	@Override
	public List<AuthorPojo> fetchAllAuthors() {
		List<AuthorEntity> allAuthorsEntity = authorDao.findAll();
		
		List<AuthorPojo> allAuthorsPojo = new ArrayList<>();
		for(AuthorEntity eachAuthorEntity: allAuthorsEntity) {
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(eachAuthorEntity, authorPojo);
			
			List<BookPojo> allBooksPojo = new ArrayList<BookPojo>();
			for(BookEntity bookEntity: eachAuthorEntity.getAllBooksEntity()) {
				BookPojo bookPojo = new BookPojo();
				BeanUtils.copyProperties(bookEntity, bookPojo);
				allBooksPojo.add(bookPojo);
			}
			authorPojo.setAllBooksPojo(allBooksPojo);
			allAuthorsPojo.add(authorPojo);
		}
		return allAuthorsPojo;
	}

	@Override
	public AuthorPojo fetchAAuthor(int authorId) {
		Optional<AuthorEntity> optionalAuthorEntity = authorDao.findById(authorId);
		if(optionalAuthorEntity.isPresent()) {
			AuthorPojo authorPojo = new AuthorPojo();
			BeanUtils.copyProperties(optionalAuthorEntity.get(), authorPojo);
			return authorPojo;
		}
		return null;
	}

	@Override
	public AuthorPojo addAuthor(AuthorPojo newAuthor) {
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(newAuthor, authorEntity);
		authorDao.saveAndFlush(authorEntity);
		newAuthor.setAuthorId(authorEntity.getAuthorId());
		return newAuthor;
	}

	@Override
	public AuthorPojo updateAuthor(AuthorPojo editAuthor) {		
		AuthorEntity authorEntity = new AuthorEntity();
		BeanUtils.copyProperties(editAuthor, authorEntity);
		authorDao.saveAndFlush(authorEntity);
		return editAuthor;	
	}

	@Override
	public void deleteAuthor(int authorId) {
		authorDao.deleteById(authorId);
	}

}

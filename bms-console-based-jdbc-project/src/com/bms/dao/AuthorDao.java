package com.bms.dao;

import java.util.List;

import com.bms.model.AuthorPojo;

public interface AuthorDao {
	List<AuthorPojo> fetchAllAuthors();
	AuthorPojo fetchAAuthor(int authorId);
	AuthorPojo addAuthor(AuthorPojo newAuthor);
	AuthorPojo updateAuthor(AuthorPojo updateAuthor);
	void deleteAuthor(int authorId);

}

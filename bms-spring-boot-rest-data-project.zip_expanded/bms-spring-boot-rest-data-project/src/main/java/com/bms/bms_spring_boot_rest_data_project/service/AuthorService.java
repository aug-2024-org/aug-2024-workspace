package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.List;

import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;

public interface AuthorService {
	List<AuthorPojo> fetchAllAuthors();
	AuthorPojo fetchAAuthor(int authorId);
	AuthorPojo addAuthor(AuthorPojo newAuthor);
	AuthorPojo updateAuthor(AuthorPojo editAuthor);
	void deleteAuthor(int authorId);
}

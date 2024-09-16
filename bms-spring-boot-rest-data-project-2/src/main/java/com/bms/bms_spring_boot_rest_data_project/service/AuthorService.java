package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.List;
import java.util.Map;

import com.bms.bms_spring_boot_rest_data_project.pojo.AuthorPojo;

public interface AuthorService {
	List<AuthorPojo> fetchAllAuthors();
	AuthorPojo fetchAAuthor(int authorId);
	AuthorPojo addAuthor(AuthorPojo newAuthor);
	AuthorPojo updateAuthor(AuthorPojo editAuthor);
	AuthorPojo patchAuthor(int authorId, Map<String, Object> updateFieldsAuthor);
	void deleteAuthor(int authorId);
}

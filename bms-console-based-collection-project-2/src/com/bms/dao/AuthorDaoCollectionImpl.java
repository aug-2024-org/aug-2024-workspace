package com.bms.dao;

import java.util.ArrayList;
import java.util.List;

import com.bms.pojo.AuthorPojo;

public class AuthorDaoCollectionImpl implements AuthorDao{

	static List<AuthorPojo> authorDataStore;
	
	static {
		authorDataStore = new ArrayList<>();
		AuthorPojo author1 = new AuthorPojo(501, "Rowling", "J.K", "");
		AuthorPojo author2 = new AuthorPojo(502, "Geronimo", "Stilton", "");
		AuthorPojo author3 = new AuthorPojo(503, "Enid", "Blyton", "");
		authorDataStore.add(author1);
		authorDataStore.add(author2);
		authorDataStore.add(author3);
	}
	
	@Override
	public List<AuthorPojo> fetchAllAuthors() {
		return authorDataStore;
	}

	@Override
	public AuthorPojo fetchAAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorPojo addAuthor(AuthorPojo newAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorPojo updateAuthor(AuthorPojo updateAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAuthor(int authorId) {
		// TODO Auto-generated method stub
		
	}

}

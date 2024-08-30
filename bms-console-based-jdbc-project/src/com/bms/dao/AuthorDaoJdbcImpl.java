package com.bms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import com.bms.model.AuthorPojo;

public class AuthorDaoJdbcImpl implements AuthorDao{

	@Override
	public List<AuthorPojo> fetchAllAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorPojo fetchAAuthor(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorPojo addAuthor(AuthorPojo newAuthor) {
		Connection conn = DBUtil.makeConnection();
		String query = "{call insert_author(?, ?, ?, ?)}";
		try {
			CallableStatement cstmt = conn.prepareCall(query);
			cstmt.registerOutParameter(4, Types.INTEGER);
			cstmt.setString(1, newAuthor.getAuthorFirstname());
			cstmt.setString(2, newAuthor.getAuthorLastname());
			cstmt.setString(3, newAuthor.getAuthorImageUrl());
			cstmt.executeUpdate();
			newAuthor.setAuthorId(cstmt.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newAuthor;
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

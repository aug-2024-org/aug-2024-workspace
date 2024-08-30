package com.bms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bms.model.AuthorPojo;
import com.bms.model.BookPojo;
import com.bms.model.CharacterPojo;

public class BookDaoJdbcImpl implements BookDao{

	@Override
	public List<BookPojo> fetchAllBooksOnly() {
		Connection conn = DBUtil.makeConnection();
		List<BookPojo> allBooksOnly = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_ALL_BOOKS_ONLY);
			
			while(rs.next()) {
				BookPojo book = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), new AuthorPojo(rs.getInt(4)), rs.getInt(5), LocalDate.of(rs.getDate(6).getYear(), rs.getDate(6).getMonth(), rs.getDate(6).getDay()+1), rs.getString(7));
				allBooksOnly.add(book);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allBooksOnly;
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		Connection conn = DBUtil.makeConnection();
		List<BookPojo> allBooks = new ArrayList<>();
		/*  
		 * book_id, - 1
		 * book_title, - 2
        book_genre, - 3
        book_price,  - 4
        book_published, - 5
        book_image_url, - 6
        b.book_author_id, - 7
        author_firstname, - 8
        author_lastname, - 9
        author_image_url, -10
        c.character_id, -11
        character_firstname,- 12
        character_lastname, - 13
        character_image_url - 14
        
		 */
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_ALL_BOOKS);
			List<CharacterPojo> allCharacters = null;
			Map<Integer, List<CharacterPojo>> allMapCharacters = new HashMap<>();
			while(rs.next()) {
				if(allMapCharacters.containsKey(rs.getInt(1))) {
					List<CharacterPojo> allChars = allMapCharacters.get(rs.getInt(1));
					allChars.add(new CharacterPojo(rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14)));
					allMapCharacters.put(rs.getInt(1), allChars);
				}else {
					BookPojo book = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), new AuthorPojo(rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10)), rs.getInt(4), LocalDate.of(rs.getDate(5).getYear(), rs.getDate(5).getMonth(), rs.getDate(5).getDay()), rs.getString(6));
					allBooks.add(book);
					List<CharacterPojo> newChars = new ArrayList<>();
					newChars.add(new CharacterPojo(rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14)));
					allMapCharacters.put(rs.getInt(1),newChars);
				}
			}	
			Set<Integer> allIds = allMapCharacters.keySet();
			for(Integer eachId : allIds) {
				for(BookPojo eachBook: allBooks) {
					if(eachBook.getBookId() == eachId) {
						eachBook.setCharacters(allMapCharacters.get(eachId));
						break;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allBooks;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		
	}

}

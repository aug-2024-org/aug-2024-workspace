package com.bms.dao;

public class DBQueries {
	public static final String FETCH_ALL_BOOKS_ONLY = "SELECT * FROM book_details";
	public static final String FETCH_ALL_BOOKS = "select b.book_id, \r\n"
			+ "        book_title, \r\n"
			+ "        book_genre, \r\n"
			+ "        book_price, \r\n"
			+ "        book_published, \r\n"
			+ "        book_image_url, \r\n"
			+ "        b.book_author_id, \r\n"
			+ "        author_firstname, \r\n"
			+ "        author_lastname, \r\n"
			+ "        author_image_url,\r\n"
			+ "        c.character_id,\r\n"
			+ "        character_firstname,\r\n"
			+ "        character_lastname,\r\n"
			+ "        character_image_url\r\n"
			+ "        \r\n"
			+ "    from \r\n"
			+ "        book_details b inner join author_details a on b.book_author_id = a.author_id\r\n"
			+ "        inner join book_character_details bc on b.book_id = bc.book_id\r\n"
			+ "        inner join character_details c on bc.character_id = c.character_id";
	
}

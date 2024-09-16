package com.bms.bms_spring_boot_rest_data_project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	// JPQL with projection
	@Query("SELECT new com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo(bookEntity.bookId, bookEntity.bookTitle) FROM BookEntity bookEntity where bookEntity.bookGenre=?1")
	List<BookPojo> findByProjectionBookGenre(String genre);
	
	// 1st way - query methods/ finder methods
	List<BookEntity> findByBookGenre(String bGenre);
	
	// 2nd way - @Query with JPQL(Java Persitence Querying Language)
	@Query("select b from BookEntity b where b.bookGenre=?1")
	List<BookEntity> getByGenre(String genre);
	
	// 3rd way - @Query with native SQL
	@Query(value = "select * from book_details where book_genre=?1", nativeQuery = true )
	List<BookEntity> getNativeByGenre(String genre);
	
	// 4th way - @NamedQuery
	@Query(name = "book.findByGenre")
	List<BookEntity> getNamedQueryByGenre(String genre);

}

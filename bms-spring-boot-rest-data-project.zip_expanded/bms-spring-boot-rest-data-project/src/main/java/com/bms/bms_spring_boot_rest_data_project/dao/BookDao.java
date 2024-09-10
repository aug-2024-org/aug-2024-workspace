package com.bms.bms_spring_boot_rest_data_project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.BookEntity;
import com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	@Query("SELECT new com.bms.bms_spring_boot_rest_data_project.pojo.BookPojo(bookEntity.bookId, bookEntity.bookTitle) FROM BookEntity bookEntity where bookEntity.bookGenre=:genre")
	List<BookPojo> findByBookGenre(String genre);
}

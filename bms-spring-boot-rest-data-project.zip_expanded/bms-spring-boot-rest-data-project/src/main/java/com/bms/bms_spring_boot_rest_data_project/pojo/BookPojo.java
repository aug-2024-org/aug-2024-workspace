package com.bms.bms_spring_boot_rest_data_project.pojo;

import java.time.LocalDate;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.AuthorEntity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookGenre;
	private AuthorPojo authorPojo;
	private int bookPrice;
	private LocalDate bookPublished;
	private String bookImageUrl;
}

package com.bms.bms_spring_boot_rest_data_project.dao.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="book_details")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "bookId")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_genre")
	private String bookGenre;
	
//	@Column(name="book_author_id")
//	private int bookAuthorId;
	
	@ManyToOne
	@JoinColumn(name="book_author_id")
	private AuthorEntity authorEntity;
	
	@Column(name="book_price")
	private int bookPrice;
	
	@Column(name="book_published")
	private LocalDate bookPublished;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
	
	@ManyToMany
	@JoinTable(name="book_character_details",
	joinColumns = @JoinColumn(name="book_id"),
	inverseJoinColumns = @JoinColumn(name="character_id"))
	List<CharacterEntity> allCharactersEntity;
	
}

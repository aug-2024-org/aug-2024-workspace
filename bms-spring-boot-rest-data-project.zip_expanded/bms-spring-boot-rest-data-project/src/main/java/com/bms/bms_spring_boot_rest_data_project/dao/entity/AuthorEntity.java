package com.bms.bms_spring_boot_rest_data_project.dao.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="author_details") // optional if table name and class name are same
public class AuthorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="author_id") // optional if column name and variable are same
	private int authorId;
	
	@Column(name="author_firstname")
	private String authorFirstName;
	
	@Column(name="author_lastname")
	private String authorLastName;
	
	@Column(name="author_image_url")
	private String authorImageUrl;
	
	@OneToMany(mappedBy="authorEntity")
	List<BookEntity> allBooksEntity;
}

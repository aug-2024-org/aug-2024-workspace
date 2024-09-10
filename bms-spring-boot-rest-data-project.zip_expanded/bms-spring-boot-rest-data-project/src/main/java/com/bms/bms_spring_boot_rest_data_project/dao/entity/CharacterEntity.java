package com.bms.bms_spring_boot_rest_data_project.dao.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="character_details")
public class CharacterEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="character_id")
	private int charId;
	
	@Column(name="character_firstname")
	private String charFirstname;
	
	@Column(name="character_lastname")
	private String charLastname;
	
	@Column(name="character_image_url")
	private String charImageUrl;
	
	@ManyToMany(mappedBy="allCharactersEntity")
	List<BookEntity> allBooksEntity;
}

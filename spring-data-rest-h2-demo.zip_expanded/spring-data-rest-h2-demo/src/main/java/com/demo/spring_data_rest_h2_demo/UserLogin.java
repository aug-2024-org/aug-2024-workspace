package com.demo.spring_data_rest_h2_demo;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity 
public class UserLogin{
	@Id
	private int id;
	private String username;
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loginId")
	@MapsId
	private UserInfo userIn;
}

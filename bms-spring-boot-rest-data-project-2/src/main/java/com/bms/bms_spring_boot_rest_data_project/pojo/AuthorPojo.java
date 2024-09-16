package com.bms.bms_spring_boot_rest_data_project.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AuthorPojo {
	private int authorId;
	private String authorFirstName;
	private String authorLastName;
	private String authorImageUrl;
	List<BookPojo> allBooksPojo;
}

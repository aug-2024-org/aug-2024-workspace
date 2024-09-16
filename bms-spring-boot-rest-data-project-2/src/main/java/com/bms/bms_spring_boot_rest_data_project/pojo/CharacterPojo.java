package com.bms.bms_spring_boot_rest_data_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CharacterPojo {
	private int charId;
	private String charFirstname;
	private String charLastname;
	private String charImageUrl;
}

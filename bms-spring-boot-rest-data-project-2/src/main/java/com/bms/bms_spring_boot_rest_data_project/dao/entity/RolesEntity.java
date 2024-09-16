package com.bms.bms_spring_boot_rest_data_project.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="roles_details")
public class RolesEntity {
	@Id
	private int rolesId;
	private String name;
}

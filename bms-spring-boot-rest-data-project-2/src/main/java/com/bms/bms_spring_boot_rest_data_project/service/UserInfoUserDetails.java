package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.RolesEntity;

import lombok.ToString;
@ToString
public class UserInfoUserDetails implements UserDetails{

	private String name;
	private String password;
	private List<SimpleGrantedAuthority> allRoles;

	public UserInfoUserDetails(String name, String password, List<RolesEntity> allRoles) {
		super();
		this.name = name;
		this.password = password;
		this.allRoles = allRoles.stream().map((role)-> new SimpleGrantedAuthority(role.getName())).toList();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return allRoles;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return name;
	}
}

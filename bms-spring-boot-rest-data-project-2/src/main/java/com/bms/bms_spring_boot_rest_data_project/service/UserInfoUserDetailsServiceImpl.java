package com.bms.bms_spring_boot_rest_data_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bms.bms_spring_boot_rest_data_project.dao.UserInfoDao;
import com.bms.bms_spring_boot_rest_data_project.dao.entity.UserInfoEntity;

@Service
public class UserInfoUserDetailsServiceImpl implements UserDetailsService{

	@Autowired 
	UserInfoDao userInfoDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserInfoEntity> userInfoEntity = userInfoDao.findByName(username);
		System.out.println("UserInfoEntity : " + userInfoEntity);
		// but we have return UserDetails and not UserInfoEntity
		UserInfoUserDetails userInfoUserDetails =  userInfoEntity
			.map((userInfo)->new UserInfoUserDetails(userInfo.getName(), userInfo.getPassword(), userInfo.getAllRoles()))
			.orElseThrow(()-> new UsernameNotFoundException(username + " not found"));
		System.out.println("UserInfoUserDetails : " + userInfoUserDetails);
		return userInfoUserDetails;
	}
}

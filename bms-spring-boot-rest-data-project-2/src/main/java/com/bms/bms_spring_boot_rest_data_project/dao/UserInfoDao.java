package com.bms.bms_spring_boot_rest_data_project.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.UserInfoEntity;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfoEntity, Integer>{
	Optional<UserInfoEntity> findByName(String name);
}

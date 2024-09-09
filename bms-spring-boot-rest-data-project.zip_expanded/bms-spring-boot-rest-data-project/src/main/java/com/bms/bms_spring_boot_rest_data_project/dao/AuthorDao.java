package com.bms.bms_spring_boot_rest_data_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bms_spring_boot_rest_data_project.dao.entity.AuthorEntity;

@Repository
public interface AuthorDao extends JpaRepository<AuthorEntity, Integer>{

}

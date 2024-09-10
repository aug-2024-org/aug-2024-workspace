package com.demo.spring_data_rest_h2_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDao extends JpaRepository<UserLogin, Integer> {

}

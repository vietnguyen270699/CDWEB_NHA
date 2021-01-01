package com.exam.hostelmanager.service;

import com.exam.hostelmanager.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    UserEntity save(UserEntity userEntity);

    UserEntity findUserByEmail(String email);

	List<UserEntity> findAll();

	

}

package com.exam.hostelmanager.service;

import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends UserDetailsService {

    UserEntity save(UserEntity userEntity);

    UserEntity findUserByEmail(String email);

	List<UserEntity> findAll();

	

}

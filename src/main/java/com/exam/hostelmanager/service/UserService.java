package com.exam.hostelmanager.service;

import com.exam.hostelmanager.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    UserEntity save(UserEntity userEntity, int index);

    UserEntity findByEmail(String email);

	List<UserEntity> findAll();
    public void updateResetPasswordToken(String token, String email) throws Exception;
    public UserEntity getByResetPasswordToken(String token);
    public void updatePassword(UserEntity userEntity, String newPassword);


}

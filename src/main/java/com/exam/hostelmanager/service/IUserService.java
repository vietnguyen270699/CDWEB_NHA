package com.exam.hostelmanager.service;

import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.UserEntity;

public interface IUserService {

    UserEntity save(UserDTO userDTO);

}

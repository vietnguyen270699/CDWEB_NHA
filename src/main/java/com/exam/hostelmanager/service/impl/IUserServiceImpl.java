package com.exam.hostelmanager.service.impl;


import com.exam.hostelmanager.common.ERole;
import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.RoleEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.repository.UserRepository;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IUserServiceImpl implements IUserService {

    private UserRepository userRepository;

    public IUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO.getId(), userDTO.getCreatedDate(),
                userDTO.getCreatedBy(), userDTO.getModifiedDate(), userDTO.getModifiedBy(),
                userDTO.getUserName(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getPhone(),
                userDTO.getAddress(), userDTO.getMoney(),
                Arrays.asList(new RoleEntity(ERole.ROLE_USER)), null, null, null, null);


        return userRepository.save(userEntity);
    }
}

package com.exam.hostelmanager.service.impl;


import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.repository.UserRepository;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO.getId(), userDTO.getCreatedDate(),
                userDTO.getCreatedBy(), userDTO.getModifiedDate(), userDTO.getModifiedBy(),
                userDTO.getUserName(), userDTO.getPassword(), userDTO.getEmail(), userDTO.getPhone(),
                userDTO.getAddress(), userDTO.getMoney());
        return userRepository.save(userEntity);
    }
}

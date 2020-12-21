package com.exam.hostelmanager.service.impl;


import com.exam.hostelmanager.dto.UserDTO;
import com.exam.hostelmanager.entity.RoleEntity;
import com.exam.hostelmanager.entity.UserEntity;
import com.exam.hostelmanager.repository.UserRepository;
import com.exam.hostelmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements IUserService {

    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity(userDTO.getId(), userDTO.getCreatedDate(),
                userDTO.getCreatedBy(), userDTO.getModifiedDate(), userDTO.getModifiedBy(),
                userDTO.getUserName(), passwordEncoder.encode(userDTO.getPassword()), userDTO.getEmail(), userDTO.getPhone(),
                userDTO.getAddress(), userDTO.getMoney());
        return userRepository.save(userEntity);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }


        return new User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private List<? extends GrantedAuthority> mapRolesToAuthorities(List<RoleEntity> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().toString())).collect(Collectors.toList());

    }

}

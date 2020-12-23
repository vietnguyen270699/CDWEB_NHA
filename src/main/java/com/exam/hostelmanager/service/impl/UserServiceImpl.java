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

import java.util.ArrayList;
import java.util.Arrays;
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
        RoleEntity entity = new RoleEntity(1L);
        UserEntity userEntity = new UserEntity(userDTO.getId(), userDTO.getCreatedDate(),
                userDTO.getCreatedBy(), userDTO.getModifiedDate(), userDTO.getModifiedBy(),
                userDTO.getUserName(), passwordEncoder.encode(userDTO.getPassword()), userDTO.getEmail(), userDTO.getPhone(),
                userDTO.getAddress(), userDTO.getMoney(), Arrays.asList(entity));
        return userRepository.save(userEntity);
    }

    @Override
    public UserDetails loadUserByUsername(java.lang.String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByEmail(username);
        if (user == null) {
            System.out.println("KHONG CO USER NAMEEEEEEEE");
            throw new UsernameNotFoundException("Invalid username or password");
        }
        User result = new User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
        System.out.println("lllllllllllOK KM OK \n" + result.getUsername() + "\n" + result.getPassword());
        for (RoleEntity a : user.getRoles()) {
            System.out.println(a.getRoleName());
        }
        return result;
    }

    private List<? extends GrantedAuthority> mapRolesToAuthorities(List<RoleEntity> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName().toString())).collect(Collectors.toList());

    }

}

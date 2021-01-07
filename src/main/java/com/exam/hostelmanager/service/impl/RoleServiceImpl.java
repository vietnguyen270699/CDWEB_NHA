package com.exam.hostelmanager.service.impl;

import com.exam.hostelmanager.entity.RoleEntity;
import com.exam.hostelmanager.repository.RoleRepository;
import com.exam.hostelmanager.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public RoleEntity findByRoleName(String roleName) {
        return roleRepository.findByRoleName(roleName).orElse(null);
    }
}

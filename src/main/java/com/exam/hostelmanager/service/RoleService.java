package com.exam.hostelmanager.service;

import com.exam.hostelmanager.entity.RoleEntity;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    RoleEntity findByRoleName(String roleName);


}

package com.exam.hostelmanager.repository;

import com.exam.hostelmanager.entity.UserEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findAll();
    Optional<UserEntity> findByEmail(String email);
    public UserEntity findByResetPasswordToken(String token);

}

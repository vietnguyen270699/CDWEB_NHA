package com.exam.hostelmanager.repository;


import com.exam.hostelmanager.entity.FeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeeRepository extends JpaRepository<FeeEntity, Long> {

    Optional<FeeEntity> findByPrice(double fee);
}

package com.exam.hostelmanager.service;

import com.exam.hostelmanager.entity.FeeEntity;

import java.util.Optional;

public interface FeeService {
    FeeEntity findByFee(double fee);
}

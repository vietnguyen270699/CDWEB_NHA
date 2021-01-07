package com.exam.hostelmanager.service;

import com.exam.hostelmanager.entity.FeeEntity;

public interface FeeService {
    FeeEntity findByFee(double fee);
}

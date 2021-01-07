package com.exam.hostelmanager.service.impl;

import com.exam.hostelmanager.entity.FeeEntity;
import com.exam.hostelmanager.repository.FeeRepository;
import com.exam.hostelmanager.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeeServiceImpl implements FeeService {
    @Autowired
    FeeRepository feeRepository;

    @Override
    public FeeEntity findByFee(double fee) {
             return feeRepository.findByPrice(fee).orElse(null);

    }
}

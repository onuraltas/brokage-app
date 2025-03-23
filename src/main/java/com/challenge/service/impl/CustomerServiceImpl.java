package com.challenge.service.impl;

import com.challenge.entity.CustomerEntity;
import com.challenge.enums.ExceptionMessage;
import com.challenge.exceptions.BrokageException;
import com.challenge.repository.CustomerRepository;
import com.challenge.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerEntity getCustomerByEmail(String email) {
        return customerRepository.findByEmail(email).orElseThrow(() -> new BrokageException(ExceptionMessage.RECORD_NOT_FOUND));
    }
}

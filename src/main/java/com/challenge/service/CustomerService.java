package com.challenge.service;

import com.challenge.entity.CustomerEntity;

public interface CustomerService {

    CustomerEntity getCustomerByEmail(String email);

}

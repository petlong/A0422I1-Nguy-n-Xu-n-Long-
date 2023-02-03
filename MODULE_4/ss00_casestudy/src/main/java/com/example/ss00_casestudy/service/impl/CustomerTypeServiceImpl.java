package com.example.ss00_casestudy.service.impl;

import com.example.ss00_casestudy.model.CustomerType;
import com.example.ss00_casestudy.repository.ICustomerTypeRepository;
import com.example.ss00_casestudy.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Integer id) {
        return iCustomerTypeRepository.findById(id).orElse(null);
    }
}

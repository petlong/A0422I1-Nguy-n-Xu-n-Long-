package com.example.exam_v02.service.impl;

import com.example.exam_v02.entity.Product;
import com.example.exam_v02.repository.IProductRepository;
import com.example.exam_v02.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    // cách tạo ngày hiện tại
//    public void create(Blog blog) {
//        Date date = new Date();
//        blog.setDatePublish(date);
//        iBlogRepository.save(blog);
//    }

    // id string tự động
//    public void save(Employee employee) {
//        if (employee.getId() == null) {
//            employeeRepository.save(employee);
//            Employee e = employeeRepository.findTopByOrderByIdDesc();
//            long idLastRecord = e.getId();
////        if (e != null)
////            idLastRecord = e.getId();
//            if (idLastRecord < 10)
//                employee.setStringId("NV-000" + idLastRecord);
//            else if (idLastRecord < 100)
//                employee.setStringId("NV-00" + idLastRecord);
//            else if (idLastRecord < 1000)
//                employee.setStringId("NV-0" + idLastRecord);
//            else
//                employee.setStringId("NV-" + idLastRecord);
//        }
////        nếu có id thì edit, còn ko có id thì update lại do phía trên save
//        employeeRepository.save(employee);
//    }

    @Override
    public void delete(Long id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) iProductRepository.findAll();
    }

    @Override
    public Page<Product> findAllWithPagingAndSortAndSearch(String search, Pageable pageable) {
        return iProductRepository.findAllByNameContaining(search, pageable);
    }

    @Override
    public Page<Product> findAllWithPagingAndSort(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public Product findById(Long id) {
        return iProductRepository.findById(id).orElse(null);
    }

    }


package service.impl;


import model.The;
import repository.ITheRepository;
import repository.impl.TheRepositoryImpl;
import service.ITheService;

import java.util.List;

public class TheServiceImpl implements ITheService {
    private ITheRepository theRepository = new TheRepositoryImpl();

    @Override
    public List<The> findAll() {
        return theRepository.findAll();
    }

//    @Override
//    public boolean save(ProductModel employee) {
        // kiểm tra dữ liệu
//        Map<String, String> errorMap = new HashMap<>();
//        if ("".equals(employee.getEmail())) {
//            errorMap.put("email", "Email không được để trống");
//        } else if (!Validation.checkEmail(employee.getEmail())) {
//            errorMap.put("email", "Email không đúng định dạng");
//        }
//        if (!Validation.checkPhone(employee.getPhone())) {
//            errorMap.put("phone", "Phone không đúng định dạng");
//        }
//        if (!Validation.checkIdCard(employee.getIdCard())) {
//            errorMap.put("idCard", "idCard không đúng định dạng");
//        }
//        if (employee.getSalary() < 0) {
//            errorMap.put("salary", "Salary phải lớn hơn 0");
//        }
//        // nêu không có lỗi thì cho lưu vào db
//        if (errorMap.isEmpty()) {
//            productRepository.save(employee);
//        }
//        return errorMap;
//        return productRepository.save(employee);

    }

//    @Override
//    public boolean edit(ProductModel productModel) {
//        return productRepository.edit(productModel);
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return productRepository.delete(id);
//    }
//
//        @Override
//    public ProductModel getProduct(int id) {
//        return productRepository.getProduct(id);
//    }
//
//    @Override
//    public List<ProductModel> search(String searchName) {
//        return productRepository.search(searchName);
//    }

//    @Override
//    public List<EmployeeModel> sort(String sortType) {
//        return productRepository.sort(sortType);
//    }


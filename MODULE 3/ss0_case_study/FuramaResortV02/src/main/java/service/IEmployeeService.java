package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    boolean add(Employee employee);

    boolean delete(int id);
}

package com.furamam04.repository;

import com.furamam04.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}

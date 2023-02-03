package com.furamam04.controller;

import com.furamam04.entity.*;
import com.furamam04.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IPositionService positionService;

    @Autowired
    private IEducationDegreeService educationDegreeService;

    @Autowired
    private IDivisionService divisionService;

    @Autowired
    private IAccountService accountService;

    @GetMapping("")
    public String showEmployeeWithPagingAndSort(Model model,
                                                @RequestParam("page") Optional<Integer> page,
                                                @RequestParam("size") Optional<Integer> size,
                                                @RequestParam("sort") Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("id");
        Page<Employee> employees;

        employees = employeeService.findAllWithPagingAndSort(PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending()));

        model.addAttribute("employees", employees);
        int totalPages = employees.getTotalPages();
        if (totalPages > 1){
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        List<Position> positions = positionService.findAll();
        List<EducationDegree> educationDegrees = educationDegreeService.findAll();
        List<Division> divisions = divisionService.findAll();
        List<Account> accounts = accountService.findAll();
        return "employee/list";
    }
}

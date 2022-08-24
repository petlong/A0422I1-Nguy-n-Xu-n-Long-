package ss00_case_study.furama_resort.services;

import ss00_case_study.furama_resort.models.Employee;

import java.util.ArrayList;

public class EmployeeServiceImpl {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public EmployeeServiceImpl(){}

    public void displayEmployee(){
        System.out.println("List employee: ");
        System.out.println(employeeArrayList.toString());

        if (employeeArrayList.size() == 0) {
            System.out.println("No have employee in list");
        }
    }

    public void addNewEmployee(Employee employee){
        employeeArrayList.add(employee);
    }

    public void setEmployee(int id, Employee employee){
        employeeArrayList.set(id-1,employee);
    }

}

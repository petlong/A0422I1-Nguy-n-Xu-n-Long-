package ss00_case_study.furama_resort.services;

import ss00_case_study.furama_resort.models.Employee;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService{
    static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    static {
        employeeArrayList.add(new Employee("001","Hoang","10/03/1988",
                "Male","001H","0905117090","Hoang@gmail","Da Nang",
                "Dai hoc","Nhan vien",1000));
    }

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

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

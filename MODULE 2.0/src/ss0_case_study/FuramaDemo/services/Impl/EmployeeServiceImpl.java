package ss0_case_study.FuramaDemo.services.Impl;

import ss0_case_study.FuramaDemo.exception.UserException;
import ss0_case_study.FuramaDemo.models.Employee;
import ss0_case_study.FuramaDemo.services.EmployeeService;
import ss0_case_study.FuramaDemo.validate.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        String name = null;
        do {
            System.out.println("Nhập tên: ");
            name = scanner.nextLine();
            try {
                Validator.validateName(name);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        Date birthday = null;
        do {
            System.out.println("Nhập ngày sinh: ");
            String dateAsString = scanner.nextLine();
            try {
                birthday = Validator.validateBirthday(dateAsString);
                break;
            } catch (UserException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương($): ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, 18, address, position, salary);
        employeeList.add(employee);
        System.out.println("Đã thêm mới nhân viên thành công");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}

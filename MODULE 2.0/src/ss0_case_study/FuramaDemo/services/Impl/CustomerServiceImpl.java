package ss0_case_study.FuramaDemo.services.Impl;

import ss0_case_study.FuramaDemo.models.Customer;
import ss0_case_study.FuramaDemo.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Loại khách hàng: ");
        String typeCustomer = scanner.nextLine();
        Customer customer = new Customer(id, name, age, address, typeCustomer);
        customerList.add(customer);
        System.out.println("Đã thêm mới khách hàng thành công");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        for (Customer customer: customerList){
            System.out.println(" ");
        }
    }
}

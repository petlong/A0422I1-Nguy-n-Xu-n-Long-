package ss00_case_study.furama_resort.controllers;

import ss00_case_study.furama_resort.models.Employee;
import ss00_case_study.furama_resort.models.Person;
import ss00_case_study.furama_resort.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }

    public void displayMainMenu() {
        int choiceMainMenu;
        System.out.println("Main menu: ");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management ");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        System.out.println("Please choice menu: ");
        choiceMainMenu = scanner.nextInt();
        switch (choiceMainMenu) {
            case 1:
                manageEmployee(employeeServiceImpl);
                break;
            case 2:
                System.out.println("1.\tDisplay list customers");
                System.out.println("2.\tAdd new customer");
                System.out.println("3.\tEdit customer");
                System.out.println("4.\tReturn main menu");
                break;
            case 3:
                System.out.println("1\tDisplay list facility");
                System.out.println("2\tAdd new facility");
                System.out.println("3\tDisplay list facility maintenance");
                System.out.println("4\tReturn main menu");
                break;
            case 4:
                System.out.println("1.\tAdd new booking");
                System.out.println("2.\tDisplay list booking");
                System.out.println("3.\tCreate new constracts");
                System.out.println("4.\tDisplay list contracts");
                System.out.println("5.\tEdit contracts");
                System.out.println("6.\tReturn main menu");
                break;
            case 5:
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                break;
            case 6:
                System.exit(6);
                break;
        }
    }

    public void manageEmployee(EmployeeServiceImpl employee) {
        int choiceEmployeeManagement;
            do{
                System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            choiceEmployeeManagement = scanner.nextInt();
            switch (choiceEmployeeManagement) {
                case 1:
                    employee.displayEmployee();
                    System.out.println();
                    break;
                case 2:
                    addEmployee(employeeServiceImpl);
                    break;
                case 3:
//                    addEmployee(e);
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
    } while(choiceEmployeeManagement!=4);
    }
    public static Person addPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of Person");
        String id = scanner.nextLine();
        System.out.println("Enter name of Person");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth of Person");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter gender of Person");
        String gender = scanner.nextLine();
        System.out.println("Enter id card of Person");
        String idCard = scanner.nextLine();
        System.out.println("Enter phone number of Person");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email of Person");
        String email = scanner.nextLine();
        System.out.println("Enter address of Person");
        String address = scanner.nextLine();
        Person person = new Person(id,name,dateOfBirth,gender,idCard,phoneNumber,email,address);
        return person;
    }

    public static Employee addEmployee(EmployeeServiceImpl e){
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        if (employee instanceof Person){
            employee = (Employee) addPerson();
        }
        System.out.println("Enter education level of Person");
        String educationLevel = scanner.nextLine();
        System.out.println("Enter position of Person");
        String position = scanner.nextLine();
        System.out.println("Enter salary of Person");
        double salary = scanner.nextDouble();

        employee.setEducationLevel(educationLevel);
        employee.setPosition(position);
        employee.setSalary(salary);

        e.addNewEmployee(employee);
        return employee;
    }
}



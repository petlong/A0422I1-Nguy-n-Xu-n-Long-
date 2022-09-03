package ss0_case_study.FuramaDemo.controllers;

import ss0_case_study.FuramaDemo.models.Facility;
import ss0_case_study.FuramaDemo.models.House;
import ss0_case_study.FuramaDemo.services.Impl.CustomerServiceImpl;
import ss0_case_study.FuramaDemo.services.Impl.EmployeeServiceImpl;
import ss0_case_study.FuramaDemo.services.Impl.FacilityServiceIplm;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Moi ban chon 1 ~ 6: ");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    displayCustomer();
                    break;
                }
                case 3: {
                    displayFacility();
                    break;
                }
                case 4: {
                    displayBooking();
                    break;
                }
                case 5: {
                    displayPromotion();
                    break;
                }
                case 6: {
                    check = false;
                    break;
                }
            }
            scanner.nextLine();
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {

                }
                case 4: {
                    check = false;
                }
            }

        }
    }
    public static void displayCustomer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customers ");
            System.out.println("2.Add new customer ");
            System.out.println("3.Edit customer ");
            System.out.println("4.Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                }
                case 2: {
                    customerService.addNew();
                }
                case 3:
            }
        }
    }
    public static void displayBooking() {
        boolean check = true;
        while (check) {
            System.out.println("1.Add new booking ");
            System.out.println("2.Display list booking ");
            System.out.println("3.Create new constracts ");
            System.out.println("4.Display list contracts ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                }
            }
        }
    }
    public static void displayFacility() {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list facility ");
            System.out.println("2.Add new facility ");
            System.out.println("3.Display list facility maintenance ");
            System.out.println("4.Return main menu ");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityServiceIplm.display(Facility.class);
                    facilityServiceIplm.display(House.class);
                }
                case 2: {
                    addNewFacility();
                }
            }
        }
    }
    public static void addNewFacility() {
        FacilityServiceIplm facilityServiceIplm = new FacilityServiceIplm();
        boolean check = true;
        while (check) {
            System.out.println("1.Add new Villa ");
            System.out.println("2.Add new House ");
            System.out.println("3.Add new Room ");
            System.out.println("4.Back to menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    facilityServiceIplm.addNewVilla();
                    displayFacility();
                    break;
                }
                case 2: {
                    facilityServiceIplm.addNewHouse();
                    displayFacility();
                    break;
                }
                case 3: {
                    facilityServiceIplm.addNewRoom();
                    displayFacility();
                    break;
                }
                case 4:
                    displayFacility();
                    break;
            }
        }
    }
    public static void displayPromotion() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers use service ");
            System.out.println("2. Display list customers get voucher ");
            System.out.println("3. Return main menu ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                }
            }
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

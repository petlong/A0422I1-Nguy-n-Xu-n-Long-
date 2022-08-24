package ss00_case_study.furama_resort.controllers;

import ss00_case_study.furama_resort.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
        EmployeeServiceImpl employee = new EmployeeServiceImpl();

    }

    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        int choiceMainMenu = 0;
        while (choiceMainMenu != 6) {
            System.out.println("Main menu: ");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.println("Please choice menu: ");
            choiceMainMenu = input.nextInt();
            switch (choiceMainMenu) {
                case 1:
                    System.out.println("1\tDisplay list employees");
                    System.out.println("2\tAdd new employee");
                    System.out.println("3\tEdit employee");
                    System.out.println("4\tReturn main menu");
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
    }
    public static void displayEmployeeManagement(){
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tReturn main menu");
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        int choieEmployeeManagement = scanner.nextInt();
        switch (choieEmployeeManagement){
            case 1:

        }
    }
}
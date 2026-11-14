package Homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            EmployeeStorage employeeStorage = new EmployeeStorage();

            boolean isRunning = true;

            while (isRunning) {

                System.out.println("\nPlease input 0 for EXIT");
                System.out.println("Please input 1 for ADD EMPLOYEE");
                System.out.println("Please input 2 for PRINT ALL EMPLOYEES");
                System.out.println("Please input 3 for SEARCH EMPLOYEE BY ID");
                System.out.println("Please input 4 for SEARCH EMPLOYEES BY COMPANY NAME");

                System.out.print("Input: ");

                int command = scanner.nextInt();
                scanner.nextLine();

                switch (command) {

                    case 0:
                        isRunning = false;
                        System.out.println("Program finished.");
                        break;

                    case 1:

                        System.out.print("Please input employee name: ");
                        String name = scanner.nextLine();

                        System.out.print("Please input employee surname: ");
                        String surname = scanner.nextLine();

                        System.out.print("Please input employee ID: ");
                        String employeeID = scanner.nextLine();

                        System.out.print("Please input employee salary: ");
                        double salary = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Please input employee company: ");
                        String company = scanner.nextLine();

                        System.out.print("Please input employee position: ");
                        String position = scanner.nextLine();

                        Employee employee = new Employee(
                                name,
                                surname,
                                employeeID,
                                salary,
                                company,
                                position
                        );

                        employeeStorage.add(employee);

                        System.out.println("Employee successfully added!");

                        break;

                    case 2:

                        employeeStorage.printAllEmployees();

                        break;

                    case 3:

                        System.out.print("Please input employee ID: ");
                        String searchID = scanner.nextLine();

                        Employee foundEmployee =
                                employeeStorage.searchByID(searchID);

                        if (foundEmployee != null) {
                            System.out.println("\nEmployee found:");
                            System.out.println(foundEmployee);
                        } else {
                            System.out.println(
                                    "Employee with ID " +
                                            searchID +
                                            " not found."
                            );
                        }

                        break;

                    case 4:

                        System.out.print("Please input company name: ");
                        String companyName = scanner.nextLine();

                        System.out.println("\nEmployees:");

                        employeeStorage.searchByCompany(companyName);

                        break;

                    default:
                        System.out.println(
                                "Invalid command. Please try again."
                        );
                }
            }

            scanner.close();
        }
    }
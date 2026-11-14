package Homework.employee;

public class EmployeeStorage {

        private Employee[] employees = new Employee[10];
        private int size = 0;

        public void add(Employee employee) {

            if (size == employees.length) {
                extend();
            }

            employees[size] = employee;
            size++;
        }

        private void extend() {
            Employee[] newEmployees = new Employee[employees.length + 10];

            for (int i = 0; i < employees.length; i++) {
                newEmployees[i] = employees[i];
            }

            employees = newEmployees;
        }

        public void printAllEmployees() {

            if (size == 0) {
                System.out.println("No employees found.");
                return;
            }

            for (int i = 0; i < size; i++) {
                System.out.println("\nEmployee " + (i + 1) + ":");
                System.out.println(employees[i]);
            }
        }

        public Employee searchByID(String employeeID) {

            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeID().equals(employeeID)) {
                    return employees[i];
                }
            }

            return null;
        }

        public void searchByCompany(String company) {

            boolean found = false;

            for (int i = 0; i < size; i++) {

                if (employees[i].getCompany().equalsIgnoreCase(company)) {

                    System.out.println(
                            employees[i].getName() + " " +
                                    employees[i].getSurname() + " - " +
                                    employees[i].getPosition()
                    );

                    found = true;
                }
            }

            if (!found) {
                System.out.println("No employees found for company " + company + ".");
            }
        }
    }
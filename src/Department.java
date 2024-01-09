import java.util.Arrays;

public class Department {

    // Fields
    private String name;
    private Employee[] employees;
//    Employee[]: This declares an array of Employee objects. The square brackets [] denote an array, and Employee is the type of elements that the array can hold. In this case, it's an array of Employee objects.
//    employees: This is the name of the variable. It's the identifier you will use to refer to this array within the class.

    private int numberOfEmployees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public Department(String name) {
        // Initialize the array with a capacity of 10
        this.employees = new Employee[10];
        this.numberOfEmployees = 0; // Initially, there are no employees
        this.name = name;
    }

    // Method to add an employee to the Department
    public void addEmployee(Employee anEmployee) {
        // Check if there is capacity to add more employees
        if (numberOfEmployees < employees.length) {
            // Add the employee to the array
            employees[numberOfEmployees] = anEmployee;
            numberOfEmployees++;
            System.out.println("Employee " + numberOfEmployees + " added to the department.");
        } else {
            System.out.println("Department is at full capacity. Cannot add more employees.");
        }
    }

    // Method to return an array of all employees in the Department without null values
    public Employee[] getAllEmployees() {
        // Create a new array with the exact size needed
        Employee[] allEmployees = new Employee[numberOfEmployees];

        // Copy the non-null elements from the original array to the new array

//        int count = 0;
//        for (Employee anEmployee : employees) {
//            if (anEmployee != null) {
//                allEmployees[count++] = anEmployee;
//           }
//        }

        // If the number of non-null elements is less than the array size, resize the array
//        if (count < numberOfEmployees) {
//            allEmployees = Arrays.copyOf(allEmployees, count);
//        }
// or
        for (int count = 0; count < numberOfEmployees; count++) {
            allEmployees[count] = employees[count];
        }
        return allEmployees;
    }

    // Method to return the number of employees currently in the Department
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Method to identify an Employee based on their identification number
    // Return the Employee object if it exists, otherwise return null
    public Employee getEmployeeById(int idNumber) {
        for (Employee anEmployee : employees) {
            // Check if the employee is not null and has the specified identification number
            if (anEmployee != null && anEmployee.getIdNumber() == idNumber) {
                return anEmployee;
            }
        }
        // If employee with the specified identification number not found
        return null;
    }

    // Method to calculate the total salary of all employees in the Department
    public double getTotalSalary() {
        double totalSalary = 0.0;

        for (Employee anEmployee : employees) {
            // Check if the employee is not null
            if (anEmployee != null) {
                totalSalary += anEmployee.getSalary();
            }
        }

        return totalSalary;
    }

    // Method to calculate the average salary of all employees in the Department
    public double getAverageSalary() {
        if (numberOfEmployees == 0) {
            return 0.0; // Avoid division by zero!!!
        }

        double totalSalary = 0.0;

        for (Employee anEmployee : employees) {
            // Check if the employee is not null
            if (anEmployee != null) {
                totalSalary += anEmployee.getSalary();
            }
        }

        return totalSalary / numberOfEmployees;
    }

}

public class HRApp {

    public static void main(String[] args) {

        System.out.println("HR App starts:");

        // Create an instance of the Department class
        Department dept1 = new Department("Software Developers");

        // Print information about the dept1 Department
        System.out.println("Department: " + dept1.getName());

        // Adding new employees using the addEmployee method
        dept1.addEmployee(new Employee(101, "Bob Engineer", 1000.0));
        dept1.addEmployee(new Employee(102, "Alice Programmer", 2000.0));
        dept1.addEmployee(new Employee(103, "Charlie Tester", 3000.0));

        System.out.println("Number of employees in the department: " + dept1.getNumberOfEmployees());

        // Displaying all employees
        System.out.println("All Employees in the department:");
        for (Employee employee : dept1.getAllEmployees()) {
            System.out.println(employee);
        }

        // Get total salary
        double totalSalary = dept1.getTotalSalary();
        System.out.println("Total salary of all employees in the department: " + totalSalary);

        // Get average salary
        double averageSalary = dept1.getAverageSalary();
        System.out.println("Average salary of employees in the department: " + averageSalary);

        // Identify an employee by ID
        int searchEmployeeId = 101; // Replace with the actual identification number
        Employee foundEmployee = dept1.getEmployeeById(searchEmployeeId);

        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee.getName());
        } else {
            System.out.println("Employee with ID " + searchEmployeeId + " not found.");
        }
    }
}

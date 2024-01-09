public class Employee {

    private int idNumber; // Field
    private Double salary; // Field
    private String name; // Field

    public Employee(int idNumber, String name, Double salary) { //Constructor, goes after getter and setter
        // Initialize fields with constructor parameters
        this.idNumber = idNumber;
        this.salary = salary;
        this.name = name;
    }
    // Constructors in Java serve several important purposes:
    // Object Initialization: Constructors are used to initialize the state of an object when it is created. They ensure that the object starts with a valid and consistent state.
    // Setting Default Values: Constructors can be used to set default values for the object's fields. This helps in ensuring that an object is in a usable state even if some values are not explicitly provided during object creation.
    // Parameterized Initialization: Constructors can take parameters, allowing you to provide different values for different instances of the class. This supports the creation of objects with specific characteristics or configurations.
    // Encapsulation and Modularity: Constructors help enforce encapsulation by allowing you to control the initialization process of an object. This means that the internal details of the object's state can be hidden and managed within the class.
    // Memory Allocation: Constructors are involved in memory allocation for the object. They allocate memory for the object and its instance variables, and they may perform additional setup if needed.
    // Automatic Invocation: Constructors are automatically invoked when an object is created using the new keyword. This ensures that the object is properly initialized before it is used.

    public int getIdNumber() {  //Getter
        return idNumber;        //Getter
    }                           //Getter

    public void setIdNumber(int idNumber) { //Setter
        this.idNumber = idNumber;           //Setter
    }                                       //Setter

    public Double getSalary() { //Getter
        return salary;          //Getter
    }                           //Getter

    public void setSalary(Double salary) {  //Setter
        this.salary = salary;               //Setter
    }                                       //Setter

    public String getName() {   //Getter
        return name;            //Getter
    }                           //Getter

    public void setName(String name) {  //Setter
        this.name = name;               //Setter
    }                                   //Setter


    @Override
    public String toString(){
        return "Employee " + getIdNumber() + ", " + getName() + ", " + getSalary();
    }
}

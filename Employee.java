package program3;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String department;
    private String phoneNumber; // New field

    // Updated constructor to include phoneNumber
    public Employee(String name, int id, double salary, String department, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Phone Number: " + phoneNumber); // Displaying phone number
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 50000.0, "Engineering", "123-456-7890");
        emp.display();
    }
}

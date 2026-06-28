import java.util.Scanner;

// Employee superclass
class EmployeeData {
    protected String name;
    protected int employeeId;
    protected double salary;

    public EmployeeData(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

// Manager subclass
class Manager extends EmployeeData {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Developer subclass
class Developer extends EmployeeData {
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Employee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Manager Input
        System.out.println("Enter Manager Details");

        System.out.print("Name: ");
        String managerName = input.nextLine();

        System.out.print("Employee ID: ");
        int managerId = input.nextInt();

        System.out.print("Salary: ");
        double managerSalary = input.nextDouble();
        input.nextLine();

        System.out.print("Department: ");
        String department = input.nextLine();

        Manager manager = new Manager(
                managerName,
                managerId,
                managerSalary,
                department);

        // Developer Input
        System.out.println("\nEnter Developer Details");

        System.out.print("Name: ");
        String developerName = input.nextLine();

        System.out.print("Employee ID: ");
        int developerId = input.nextInt();

        System.out.print("Salary: ");
        double developerSalary = input.nextDouble();
        input.nextLine();

        System.out.print("Programming Language: ");
        String language = input.nextLine();

        Developer developer = new Developer(
                developerName,
                developerId,
                developerSalary,
                language);

        // Display Information
        System.out.println("\n--- Manager Details ---");
        manager.displayInfo();

        System.out.println("\n--- Developer Details ---");
        developer.displayInfo();

        input.close();
    }
}

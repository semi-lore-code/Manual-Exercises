// ==================== FILE 4: StudentManager.java ====================
public class StudentManager {
    // Fields
    String name;
    int    age;
    double gpa;

    // Constructor
    StudentManager(String name, int age, double gpa) {
        this.name = name;
        this.age  = age;
        this.gpa  = gpa;
    }

    // Display student details
    void introduce() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("GPA  : " + gpa);
        System.out.println("--------------------");
    }
}

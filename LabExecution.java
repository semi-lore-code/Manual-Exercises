public class LabExecution {
    public static void main(String[] args) {

        System.out.println("=== 1. Testing Vehicles (Polymorphism) ===");
        Vehicle myCar = new Car("Toyota", 120, 4);
        Vehicle myBike = new Bicycle("Tremor", 25, true);

        myCar.move();
        myBike.move();


        System.out.println("\n=== 2. Testing Employee System ===");
        Employee mgr = new Manager("Sarah", 500000, 75000);
        Employee dev = new Developer("David", 350000, 10, 2500);

        System.out.println(mgr.getName() + " Total Salary: ₦" + mgr.calculateSalary());
        System.out.println(dev.getName() + " Total Salary: ₦" + dev.calculateSalary());


        System.out.println("\n=== 3 & 4. Testing Shape & Constructor Chaining ===");
        Shape blueCircle = new Circle("Blue", 7.0);
        Shape redBox = new Rectangle("Red", 5.0, 10.0);

        System.out.printf("Circle color: %s | Area: %.2f\n", blueCircle.getColor(), blueCircle.getArea());
        System.out.printf("Rectangle color: %s | Area: %.2f\n", redBox.getColor(), redBox.getArea());
    }
}

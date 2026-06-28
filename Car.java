public class Car {
    // Encapsulated fields — private so they can't be accessed directly
    private String model;
    private double speed;

    // Constructor — use 'this' to distinguish instance variables from parameters
    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    // Getters
    public String getModel() { return model; }
    public double getSpeed() { return speed; }

    // Methods
    public void accelerate(double amount) {
        speed += amount;
        System.out.println(model + " accelerated! Speed: " + speed + " km/h");
    }

    public void brake(double amount) {
        speed -= amount;
        if (speed < 0) speed = 0; // can't go negative
        System.out.println(model + " braked! Speed: " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Model: " + model + " | Speed: " + speed + " km/h");
    }
}
